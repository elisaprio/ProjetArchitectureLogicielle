package tp.v2;

public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	default ListeMutable<E> miroir(){
		// TODO
		return null;
	}

	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			// TODO Définir les méthodes utiles.	
			public boolean casCons(){
				return true;
			}
			public E tete(){
				return t;
			}
			public ListeMutable<E> reste(){
				return r;
			}
			public int taille(){
				return 1+r.taille();
			}
		};
	}
	
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			// TODO Définir les méthodes utiles.	
			public boolean casVide(){
				return true;
			}
		};
	}
	
}
