package tp.v2;

import java.util.Iterator;

public class IterateurListe<E> implements Iterator<E> {

	private Liste liste;
	
	public IterateurListe(Liste liste){
		this.liste=liste;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

}
