package tp.v2;

import java.util.Iterator;

public class CasFileMutable<E> implements FileMutable<E> {

	private ListeMutable<E> premier;
	private ListeMutable<E> suivant;
	
	public CasFileMutable(ListeMutable<E> premier, ListeMutable<E> suivant) {
		// TODO Auto-generated constructor stub
		this.premier=premier;
		this.suivant=suivant;
	}

	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return this.premier.tete();
	}

	@Override
	public FileMutable<E> suivants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.premier.taille()+this.suivant.taille();
	}

	@Override
	public FileMutable<E> ajout(E dernierDansFile) {
		// TODO Auto-generated method stub
		ListeMutable<E> deb = ListeMutable.cons(dernierDansFile,this.premier);
		
		return null;
	}

	@Override
	public FileMutable<E> retrait() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileMutable<E> ajout(File<E> secondeFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileMutable<E> creer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		// TODO Auto-generated method stub
		
	}

}
