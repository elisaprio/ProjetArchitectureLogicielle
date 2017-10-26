package Etape1;

public interface ServiceEmpilageDepilage<T> {
	
	// Ajoute un élément T  en queue de file
	void empiler(T t);
	
	// Retire le premier élément de la liste
	T depiler();
}
