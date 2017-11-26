package filRouge.v5;

public interface FileMutable<K extends File<K,E>,E> extends File<K, E>, IdentifiableParIteration<K, E>, RepresentableParIteration<E> {

	void ajouter(E element);
	void retirer();
	
	default K suivants(){
		FileMutable<K,E> res = this.creerCopie();
		res.retirer();
		return res.sujet();
	}
	
	FileMutable<K,E> creerCopie(); // Fabrique realisant une copie de la file

	K retrait();
	K ajout(E dernierElement);

	//Facultatif: 
	//void ajouter(FileMutable<E> file);
	
}
