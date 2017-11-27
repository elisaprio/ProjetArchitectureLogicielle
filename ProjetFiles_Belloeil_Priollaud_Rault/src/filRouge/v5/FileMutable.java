package filRouge.v5;

public interface FileMutable<E> extends File<FileMutable<E>, E>, IdentifiableParIteration<FileMutable<E>, E>, RepresentableParIteration<E> {

	void ajouter(E element);
	void retirer();
	
	default FileMutable<E> suivants(){
		FileMutable<E> res = this.creerCopie();
		res.retirer();
		return res.sujet();
	}
	
	FileMutable<E> creerCopie(); // Fabrique realisant une copie de la file

	FileMutable<E> retrait();
	FileMutable<E> ajout(E dernierElement);

	//Facultatif: 
	//void ajouter(FileMutable<E> file);
	
}
