package tp.v1;

import java.util.LinkedList;

/**
 * The Class CasFiles.
 *
 * @param <T> the generic type
 */
public class CasFiles<T> implements Files<T>, ServiceEmpilageDepilage<T>{
	
	/** The file. */
	private LinkedList<T> file = new LinkedList<T>();
	
	/**
	 * Instantiates a new cas files.
	 */
	public CasFiles(){
		this.file= new LinkedList<T>();
	}
	
	/**
	 * Instantiates a new cas files.
	 *
	 * @param file the file
	 */
	public CasFiles(LinkedList<T> file){
		this.file=file;
	}
	
	
	public boolean estVide(){
		return this.file.isEmpty();
	}
	
	public T dernierElement(){
		return this.file.getLast();
	}
	
	public T premierElement(){
		return this.file.getFirst();
	}

	@Override
	public void empiler(T t) {
		this.file.add(t);
		
	}

	@Override
	public T depiler() {
		this.file.removeFirst();
		return this.file.getFirst();
	}
}

