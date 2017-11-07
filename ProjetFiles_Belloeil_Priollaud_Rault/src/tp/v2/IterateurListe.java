package tp.v2;

import java.util.Iterator;

public class IterateurListe<E> implements Iterator<E> {

	private Liste liste;
	private int index;
	
	public IterateurListe(Liste liste){
		this.liste=liste;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (this.index<this.liste.taille()){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		if(this.hasNext()){
			index++;
		}
		return null;
	}

}
