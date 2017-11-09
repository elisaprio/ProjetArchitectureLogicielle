package tp.v2;

import java.util.Iterator;

public class CasFileMutable<E> implements FileMutable<E> {

	private ListeMutable<E> fin;
	private ListeMutable<E> liste;
	
	private CasFileMutable() {
		this.liste=ListeMutable.vide();
	}
	
	public CasFileMutable(ListeMutable<E> liste) {
		// DONE
		this.liste=liste;
	}

	@Override
	public E premier() {
		// DONE
		return this.liste.tete();
	}

	@Override
	public int taille() {
		// DONE
		return this.fin.taille()+this.liste.taille();
	}

	@Override
	public Iterator<E> iterator(){
		return this.liste.iterator();
	}
	
	
	@Override
	public void ajouter(E element) {
		// DONE
		liste.changerReste(ListeMutable
				.cons(element, liste.reste().miroir())
				.miroir());
	}
	

	@Override
	public void retirer() {
		// DONE
		this.liste.changerTete(liste.reste().tete());
		this.liste.changerReste(liste.reste().reste());
	}


	@Override
	public FileMutable<E> creer() {
		// DONE
		return new CasFileMutable<E>();
	}

	@Override
	public FileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return new CasFileMutable<E>(this.liste);
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		for(E element: secondeFile) {
			this.ajout(element);
		}
	}

}
