package filRouge.v5;

public interface FileImmutable<K extends File<K,E>,E> extends File<K, E>, IdentifiableParIteration<K, E>, RepresentableParIteration<E> {

	FileImmutable<K,E> creer(E dernier); // Fabrique d'une file formée de la file cible et 
    										//   d'un nouveau dernier élément
	default K retrait(){
		return this.sujet().retrait();
	}
	
	default K ajout(E elem){
		return this.sujet().ajout(elem);
	}
}
