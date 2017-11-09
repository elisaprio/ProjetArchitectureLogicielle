package tp.v2;

import java.util.Iterator;

public class CasFileMutable<E> implements ListeMutable<E>, FileMutable<E> {

	private ListeMutable<E> premier;
	private ListeMutable<E> suivant;
	
	public CasFileMutable(ListeMutable<E> premier, ListeMutable<E> suivant) {
		// DONE
		this.premier=premier;
		this.suivant=suivant;
	}

	@Override
	public E premier() {
		// DONE
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
		// OnGoing  --> ajout a la fin de la liste
		this.suivant.miroir();
		ListeMutable.cons(dernierDansFile, this.suivant);
		this.suivant.miroir();
		
		// ou bien ajout en tete et changement de la tete
		ListeMutable<E> deb = ListeMutable.cons(this.premier.tete(), this.suivant);
		this.premier.changerTete(dernierDansFile); 
		this.suivant=deb;
		
		//comment retourner une file ????
		return null;
	}

	@Override
	public FileMutable<E> retrait() {
		// TODO besoin de retirer la tete
		
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

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return FileMutable.super.estVide();
	}

}
