package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	
	/*
	 * retourne true si la liste est vide
	 * retourne false par d�faut
	 * @return boolean
	 */
	default boolean casVide() {
		return false;
	}
	/*
	 * retourne l'�l�ment en t�te de liste
	 * @return E
	 */
	default E tete() {
		throw new UnsupportedOperationException();
	}
	/*
	 * retourne la liste priv�e de son �l�ment de t�te
	 * @return Liste<E>
	 */
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	/*
	 * retourne true si la liste est constitu� d'un �l�ment de t�te non nul et d'une queue
	 * @return boolean
	 */
	default boolean casCons() {
		return false;
	}
	/*
	 * retourne la taille de la liste
	 * retourne 0 par d�faut
	 * @return int
	 */
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	/*
	 * retourne un it�rateur sur les listes
	 * @return Itarator<E>
	 */
	default Iterator<E> iterator() {
		// DONE
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}
	/*
	 * retourne la liste en ordre invers�.
	 * @return Liste<E>
	 */
	default Liste<E> miroir(){
		// DONE
		Liste<E> res = vide();
		res = cons(this.tete(),res);
		Liste<E> reste = this.reste();
		while(!reste.casVide()){
			res = cons(reste.tete(),res);
			reste=reste.reste();
		}
		return res;
	}
	
	/*
	 * retourne la cha�ne de caract�re des �l�ments de la liste
	 * @return String
	 */
	default String listeToString() {
		if(this.casVide())
			return "vide";
		else
			return ""+this.tete()+", "+this.reste().listeToString();
	}
	
	
	
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
	//DONE
			public boolean casVide(){
				return true;
			}
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			// TODO Définir les méthodes utiles.
			public boolean casCons(){
				return true;
			}
			public E tete(){
				return t;
			}
			public Liste<E> reste(){
				return r;
			}
			public int taille(){
				return 1+r.taille();
			}
		};
	}

	
}
