package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	E premier();
	File<E> suivants();
	
	default boolean estVide() {
		return this.taille() == 0;
	}
	int taille();
	
	/*
	 * Fabriques
	 */
	File<E> creer();
	
	/*
	 * Services
	 */
	File<E> ajout(E dernierDansFile);
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	default String representation() {
		// DONE
		String res=this.premier().toString();
		if(!this.suivants().estVide()){
			res+=this.suivants().representation();
		}
		return res;
	}

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