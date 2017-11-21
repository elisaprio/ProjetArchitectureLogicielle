package ancientp.v2;

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
		this.fin = Liste.vide();
	}

	@Override
	public E premier() {
		if (this.debut.casVide()){
			this.debut=this.fin.miroir();
		}
		return this.debut.tete();
	}

	@Override
	public int taille() {
		// DONE
		return this.debut.taille()+this.fin.taille();
	}


	@Override
	public Iterator<E> iterator() {
		// DONE
		return new IterateurListe<E>(debut);
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
