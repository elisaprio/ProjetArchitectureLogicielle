package filRouge.v5;

public interface EtatFile<K extends File<K,E>, E> extends File<K,E>{

	E premier();
	K suivants();
	
	K creer();
}
