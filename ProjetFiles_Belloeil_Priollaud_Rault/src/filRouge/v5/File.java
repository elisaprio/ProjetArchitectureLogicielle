package filRouge.v5;

public interface File<K, E> extends Iterable<E>, Mesurable {

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
	//K ajout(K secondeFile); //ajout de la seconde file en fin de file
	
	/*default K ajout2(K secondeFile){// Ajout de la seconde file en fin de file
		this.ajout(secondeFile.premier());   //BESOIN DE RAJOUTER LE PREMIER ELEM DE secondeFile
		return this.ajout2(secondeFile.suivants());
	}*/
}
