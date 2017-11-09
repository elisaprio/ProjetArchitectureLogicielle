package tp.v2;


public class Test {
	private static void testListe() {
		System.out.println("-- Tests Listes Immutables --");
		Liste<String> vide= Liste.vide();
		Liste<String> liste= Liste.cons("Elisa",Liste.cons("Adele", Liste.cons("Vincent", vide)));
		
		System.out.println("Test casVide() (true si la liste est vide)");
		System.out.println("Expected true "+vide.casVide());
		System.out.println("Expected false "+liste.casVide());
		System.out.println();
		
		System.out.println("Test casCons() (true si la liste n'est pas vide)");
		System.out.println("Expected true "+liste.casCons());
		System.out.println("Expected false "+vide.casCons());
		System.out.println();
		
		System.out.println("Test taille()");
		System.out.println("Expected 0 : " + vide.taille());
		System.out.println("Expected 3 : " + liste.taille());
		System.out.println();
		
		System.out.println("Test tete()");
		try{
			System.out.println(vide.tete());
		}
		catch(Exception e) {
			System.out.println("methode tete fonctionne pour la liste vide");
		}
		System.out.println("Expected Elisa : "+liste.tete());
		System.out.println();
		
		System.out.println("Test reste()");
		try{
			System.out.println(vide.reste());
		}
		catch(Exception e) {
			System.out.println("methode reste fonctionne pour la liste vide");
		}
		System.out.println("Expected Adele : "+liste.reste().tete());
		System.out.println();
		
		
		System.out.println("Test miroir()");
		System.out.println("Expected Vincent : "+liste.miroir().tete());
		System.out.println("Expected Adele, Elisa, vide : "+liste.miroir().reste().listeToString());
		System.out.println();
		
		System.out.println();
	}
	
	public static void testListeMutable() {
		System.out.println("-- Tests Listes Mutables--");
		ListeMutable<String> videMutable = ListeMutable.vide();
		ListeMutable<String> listeMutable= ListeMutable.cons("Elisa",ListeMutable.cons("Adele", ListeMutable.cons("Vincent", videMutable)));
	
		System.out.println("Test casVide() (true si la liste est vide)");
		System.out.println("Expected true "+videMutable.casVide());
		System.out.println("Expected false "+listeMutable.casVide());
		System.out.println();
		
		System.out.println("Test casCons() (true si la liste n'est pas vide)");
		System.out.println("Expected true "+listeMutable.casCons());
		System.out.println("Expected false "+videMutable.casCons());
		System.out.println();
		
		System.out.println("Test taille()");
		System.out.println("Expected 0 : " + videMutable.taille());
		System.out.println("Expected 3 : " + listeMutable.taille());
		System.out.println();
		
		System.out.println("Test tete()");
		try{
			System.out.println(videMutable.tete());
		}
		catch(Exception e) {
			System.out.println("methode tete fonctionne pour la liste vide");
		}
		System.out.println("Expected Elisa : "+listeMutable.tete());
		System.out.println();
		
		System.out.println("Test reste()");
		try{
			System.out.println(videMutable.reste());
		}
		catch(Exception e) {
			System.out.println("methode reste fonctionne pour la liste vide");
		}
		System.out.println("Expected Adele : "+listeMutable.reste().tete());
		System.out.println();
		
		
		System.out.println("Test miroir()");
		System.out.println("Expected Vincent : "+listeMutable.miroir().tete());
		System.out.println("Expected Adele, Elisa, vide : "+listeMutable.miroir().reste().listeToString());
		System.out.println();
		
		System.out.println("Test changerTete()");
		try{
			videMutable.changerTete("Toto");
			System.out.println("La méthode ne fonctionne pas");
		}
		catch(Exception e) {
			System.out.println("La methode fonctionne pour la liste mutable vide");
		}
		listeMutable.changerTete("Toto");
		System.out.println("Expected Toto : " + listeMutable.tete());
		System.out.println();
		
		System.out.println("Test changerReste()");
		try{
			videMutable.changerReste(listeMutable);
			System.out.println("La méthode ne fonctionne pas");
		}
		catch(Exception e) {
			System.out.println("La methode fonctionne pour la liste mutable vide");
		}
		listeMutable.changerReste(videMutable);
		System.out.println("Expected Toto,vide " + listeMutable.listeToString());
		System.out.println();
		
		
		System.out.println();
	
	}
	
	
	public static void testCasFileMutable() {
		System.out.println("-- Tests Implementaiton Cas file Mutable--");
		
		ListeMutable<String> videMutable = ListeMutable.vide();
		ListeMutable<String> listeMutable= ListeMutable.cons("Elisa",ListeMutable.cons("Adele", ListeMutable.cons("Vincent", videMutable)));
	
		CasFileMutable<String> vide = new CasFileMutable();
		CasFileMutable<String> liste = new CasFileMutable(listeMutable);

		System.out.println("Test premier()");
		try{
			vide.premier();
			System.out.println("La méthode ne fonctionne pas");
		}
		catch(Exception e) {
			System.out.println("La methode fonctionne pour le CasFileMutable vide");
		}
		System.out.println("Expected Elisa: "+liste.premier());
		System.out.println();
		
		System.out.println("Test taille()");
		System.out.println("Expected 0 : " + vide.taille());
		System.out.println("Expected 3 : " + liste.taille());
		System.out.println();
		
		
		System.out.println("Test ajouter element");
		vide.ajouter("Toto");
		System.out.println("Expected Toto, vide : "+ vide.represente());
		liste.ajouter("Toto");
		System.out.println("Expected Elisa, Adele, Vincent, Toto, vide : "+liste.represente());
		System.out.println();
		
		System.out.println("Test retirer()");
		vide.retirer();
		System.out.println("Expected vide : "+ vide.represente());
		liste.retirer();
		System.out.println("Expected Adele, Vincent, Toto, vide : "+ liste.represente());
		System.out.println();
		
		System.out.println("Test ajouter File");
		CasFileMutable<String> file1 = new CasFileMutable<String>(listeMutable);
		CasFileMutable<String> file2 = new CasFileMutable<String>(listeMutable);
		
		file1.ajouter(file2);
		System.out.println("Expected  Adele, Vincent, Toto, Adele, Vincent, Toto, vide :"+file1.represente());
		System.out.println();
		
		
	}
	
	public static void main(String[] args){
		testListe();
		testListeMutable();
		testCasFileMutable();
	}
	
}
