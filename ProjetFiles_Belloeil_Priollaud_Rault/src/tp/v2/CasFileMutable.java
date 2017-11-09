package tp.v2;

import java.util.Iterator;

public class CasFileMutable<E> implements FileMutable<E> {

	private ListeMutable<E> fin;
	private ListeMutable<E> liste;
	
	public CasFileMutable(ListeMutable<E> premier, ListeMutable<E> suivant) {
		// DONE
		this.fin=premier;
		this.liste=suivant;
	}

	@Override
	public E premier() {
		// DONE
		return this.fin.tete();
	}

	@Override
	public FileMutable<E> suivants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.fin.taille()+this.liste.taille();
	}

	@Override
	public FileMutable<E> ajout(E dernierDansFile) {
		// OnGoing  --> ajout a la fin de la liste
		this.liste.miroir();
		ListeMutable.cons(dernierDansFile, this.liste);
		this.liste.miroir();
		
		// ou bien ajout en tete et changement de la tete
		ListeMutable<E> deb = ListeMutable.cons(this.fin.tete(), this.liste);
		this.fin.changerTete(dernierDansFile); 
		this.liste=deb;
		
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
	public boolean estVide() {
		// TODO Auto-generated method stub
		return FileMutable.super.estVide();
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
