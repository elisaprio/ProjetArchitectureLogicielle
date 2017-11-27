package filRouge.v5;

public interface File<K extends Iterable<E>,E> extends Iterable<E>, Mesurable {

	E premier();
	K suivants();
	default boolean estVide(){
		return true;
	}
	
	K creer(); // fabrique d'une file vide
	@SuppressWarnings("unchecked")
	default K sujet(){ // Alias de this
	  return (K)this;
	}
	
	K ajout(E dernierDansFile); // Ajout en fin
	K retrait(); // Retrait de premier �l�ment
	default K ajout(K secondeFile){
		for(E e:secondeFile){
			this.ajout(e);
		}
		return this.sujet();
	} //ajout de la seconde file en fin de file
}
