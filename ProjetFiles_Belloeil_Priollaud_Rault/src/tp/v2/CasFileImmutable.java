package tp.v2;

import java.util.Iterator;

public class CasFileImmutable<E> implements FileImmutable<E> {
	
	private Liste<E> debut;
	private Liste<E> fin;
	

	public CasFileImmutable(Liste<E> debut, Liste<E> fin) {
		super();
		this.debut = debut;
		this.fin = fin;
	}
	
	public CasFileImmutable() {
		this.debut = Liste.vide();
	}

	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return this.debut.tete();
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.debut.taille()+this.fin.taille();
	}

	@Override
	public FileImmutable<E> ajout(E dernierDansFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> retrait() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> ajout(File<E> secondeFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> suivants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> creer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> creer(E dernier) {
		// TODO Auto-generated method stub
		return null;
	}

}
