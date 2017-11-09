package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	/*
	 * retourne le premier element de la file
	 * @return E
	 */
	E premier();
	/*
	 * retourne la liste sans le premier element
	 * @return File<E>
	 */
	File<E> suivants();
	
	/*
	 * retourne true si la liste est vide
	 * @return boolean
	 */
	default boolean estVide() {
		return this.taille() == 0;
	}
	/*
	 * retourne la taille de la file
	 * @return int
	 */
	int taille();
	
	/*
	 * Fabriques
	 */
	/*
	 * crée et retourne une File vide
	 * @return File<E>
	 */
	File<E> creer();
	
	/*
	 * Services
	 */
	/*
	 * ajoute le param de type E à la file et la retourne
	 * @return File<E>
	 */
	File<E> ajout(E dernierDansFile);
	/*
	 * retire la dernier element de la file et renvoie la file restante
	 * @return File<E>
	 */
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	/*
	 * retourne la chaine de caracteres des elements de la file
	 * @return String
	 */
	default String representation() {
		// DONE
		String res=this.premier().toString();
		if(!this.suivants().estVide()){
			res+=this.suivants().representation();
		}
		return res;
	}

	/*
	 * retourne true si la file contient les mêmes éléments que la file paramètre
	 * @return boolean
	 */
	default boolean estEgal(File<E> file){
		// DONE
		if (this.estVide() && file.estVide()){
			return true;
		}
		else{
			if(this.premier() == file.premier() && this.suivants().estEgal(file.suivants())){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	
}