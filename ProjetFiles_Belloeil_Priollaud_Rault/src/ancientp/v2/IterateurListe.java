package ancientp.v2;

import java.util.Iterator;

public class IterateurListe<E> implements Iterator<E> {

	private Liste<E> liste;
	
	public IterateurListe(Liste<E> liste){
		this.liste=liste;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.liste.taille()!=0;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		if(this.hasNext()){
			E res=this.liste.tete();
			this.liste=this.liste.reste();
			return res;
		}
		else{
			return null;
		}
	}

}
