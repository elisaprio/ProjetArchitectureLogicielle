package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	
	/*
	 * retourne true si la liste est vide
	 * retourne false par défaut
	 * @return boolean
	 */
	default boolean casVide() {
		return false;
	}
	/*
	 * retourne l'élément en tête de liste
	 * @return E
	 */
	default E tete() {
		throw new UnsupportedOperationException();
	}
	/*
	 * retourne la liste privée de son élément de tête
	 * @return Liste<E>
	 */
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	/*
	 * retourne true si la liste est constitué d'un élément de tête non nul et d'une queue
	 * @return boolean
	 */
	default boolean casCons() {
		return false;
	}
	/*
	 * retourne la taille de la liste
	 * retourne 0 par défaut
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
	 * retourne un itérateur sur les listes
	 * @return Itarator<E>
	 */
	default Iterator<E> iterator() {
		// DONE
		return new IterateurListe<E>(this); // ComplÃ©ter puis utiliser IterateurListe.
	}
	/*
	 * retourne la liste en ordre inversé.
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
	 * retourne la chaîne de caractère des éléments de la liste
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
			// TODO DÃ©finir les mÃ©thodes utiles.
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
