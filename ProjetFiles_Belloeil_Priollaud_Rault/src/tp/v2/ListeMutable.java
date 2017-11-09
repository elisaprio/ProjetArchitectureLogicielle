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
		// DONE
				ListeMutable<E> res = vide();
				res = cons(this.tete(),res);
				ListeMutable<E> reste = this.reste();
				while(!reste.casVide()){
					res = cons(reste.tete(),res);
					reste=reste.reste();
				}
				return res;
	}

	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			//DONE
			
			private E tete=t;
			private ListeMutable<E> reste = r;
			
			public boolean casCons(){
				return true;
			}
			public E tete(){
				return tete;
			}
			public ListeMutable<E> reste(){
				return reste;
			}
			public int taille(){
				return 1+reste.taille();
			}
			
			public void changerTete (E tete) {
				this.tete=tete;
			}
			
			public void changerReste(ListeMutable<E> reste) {
				this.reste=reste;
			}
		};
	}
	
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			// DONE	
			public boolean casVide(){
				return true;
			}
		};
	}
	
}
