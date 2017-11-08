package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	default boolean casVide() {
		return false;
	}
	default E tete() {
		throw new UnsupportedOperationException();
	}
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	default boolean casCons() {
		return false;
	}
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	default Iterator<E> iterator() {
		// DONE
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}
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
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			// TODO Définir les méthodes utiles.	
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
