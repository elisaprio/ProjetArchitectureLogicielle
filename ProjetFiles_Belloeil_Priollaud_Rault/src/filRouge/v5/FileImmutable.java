package filRouge.v5;

public interface FileImmutable<K extends File<K,E>,E> extends File<K, E>, IdentifiableParIteration<K, E>, RepresentableParIteration<E> {

	FileImmutable<K,E> creer(E dernier);
	
	default K retrait(){
		return this.sujet().retrait();
	}
	
	default K ajout(E elem){
		return this.sujet().ajout(elem);
	}
}
