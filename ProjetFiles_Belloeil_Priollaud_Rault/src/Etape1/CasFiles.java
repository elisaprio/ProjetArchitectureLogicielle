package Etape1;

import java.util.LinkedList;

public class CasFiles<T> implements Files<T>{
	private LinkedList<T> file = new LinkedList<T>();
	
	public CasFiles(){
		this.file= new LinkedList<T>();
	}
	
	public CasFiles(LinkedList<T> file){
		this.file=file;
	}
	
	public boolean isEmpty(){
		return true;
	}
	
	public T dernierElement(){
		return this.file.getLast();
	}
}

