package etape0;

public interface File {
	
	//http://www.grall.name/teaching/softwareArchitecture/2018/interfaceDesign.html#orge41c82b
	E tete();
	
	File retirer();
	
	File ajouter(E dernier);

}
