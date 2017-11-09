package tp.v2;

import java.util.Iterator;

public class CasFileMutable<E> implements FileMutable<E> {

	private ListeMutable<E> fin;
	private ListeMutable<E> liste;
	
	public CasFileMutable() {
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
		return liste.taille();
	}

	@Override
	public Iterator<E> iterator(){
		return this.liste.iterator();
	}
	
	
	@Override
	public void ajouter(E element) {
		// DONE
		if(!this.liste.casVide()) {
			liste.changerReste(ListeMutable
					.cons(element, liste.reste().miroir())
					.miroir());
		}else {
			this.liste=ListeMutable.cons(element, this.liste);
		}
	}
	

	@Override
	public void retirer() {
		// DONE
		if(!this.liste.casVide()) {
			this.liste.changerTete(liste.reste().tete());
			this.liste.changerReste(liste.reste().reste());
		}
	}


	@Override
	public FileMutable<E> creer() {
		// DONE
		return new CasFileMutable<E>();
	}

	@Override
	public FileMutable<E> creerCopie() {
		return new CasFileMutable<E>(this.liste);
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		for(E element: secondeFile) {
			this.ajout(element);
		}
	}
	
	public String represente() {
		String res = this.liste.listeToString();
		if(this.fin !=null) {
			res+=this.fin.listeToString();
		}
		return res;
	}
	
}
