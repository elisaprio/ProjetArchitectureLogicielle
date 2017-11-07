package tp.v2;

import java.util.Iterator;

public class IterateurListe<E> implements Iterator<E> {

	private Liste<E> liste;
	private int index;
	
	public IterateurListe(Liste<E> liste){
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
			Liste<E> copie = this.liste;
			for(int i = 0; i<index; i++){
				
			}
			index++;
		}
		return null;
	}

}
