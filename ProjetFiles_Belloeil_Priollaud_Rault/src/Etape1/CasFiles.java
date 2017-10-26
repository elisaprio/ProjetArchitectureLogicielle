package Etape1;

import java.util.LinkedList;

public class CasFiles<T> implements Files<T>, ServiceEmpilageDepilage<T>{
	private LinkedList<T> file = new LinkedList<T>();
	
	// Constructeur creant une liste vide
	
	public CasFiles(){
		this.file= new LinkedList<T>();
	}
	
	// Constructeur prenant en argument une liste
	
	public CasFiles(LinkedList<T> file){
		this.file=file;
	}
	
	// Méthode retournant True si la liste est vide, False sinon
	
	public boolean isEmpty(){
		return this.file.isEmpty();
	}
	
	// Méthode retournant le dernier élément de la liste
	
	public T dernierElement(){
		return this.file.getLast();
	}

	//Méthode ajoutant un élément t en queue de file
	
	@Override
	public void empiler(T t) {
		this.file.add(t);
		
	}

	//Méthode etirant le premier élément de la liste et retourant cet élément
	
	@Override
	public T depiler() {
		this.file.removeFirst();
		return this.file.getFirst();
	}
}

