package cat.paucasesnovescifp.swpro;

import cat.paucasesnovescifp.swpro.secretaria.Secretaria;

public class Main {
    public static void main(String[] args) {
    	Main proves = new Main();
    	// proves.exercici1();
    	
    	 proves.exercici3();
    }
    
    
    
    public void exercici1() {
    	Secretaria a = new Secretaria();
    	/*
    	 *  EXERCICI 1
    	 */
    	
    	//Afegim 2 alumnes.
    	a.afegirAlumne("78219594k", "Isaac Palou Gijón");
    	a.afegirAlumne("32312313k", "Pere Segui Crespi");
    	// Recuperam 1 alumne pel seu dni.
    	a.recuperarAlumne("78219594k");
    	// Esborram 1 alumne pel seu dni.
    	a.esborrarAlumne("78219594k");
    	// Intentam recuperar l'alumne borrar per amem si l'ha esborrat de veres, torna null perque no existeix.
    	a.recuperarAlumne("78219594k");
    }
    public void exercici2() {
    	/*
    	 * EXERCICI 2
    	 */
    	Secretaria a = new Secretaria();
    	// Es pot afegir alumnes.
    	a.afegirProfessor("11111111J", "Joan Gelabert Socias", "biologia");
    	a.afegirProfessor("22222222J", "Frederic Chaves", "biologia");
    	a.afegirProfessor("33333333J", "Victor reina riera", "mates");
    	
    	
    	System.out.println();
    }
    
    public void exercici3() {
    	Secretaria a = new Secretaria();
    	/*
    	 *  EXERCICI 3
    	 */
    	
    	// Afegim 3 alumnes nous
    	
    	a.coaNouAlumne("7813121F", "Pedro picapiedra");
    	a.coaNouAlumne("1312312F", "Albert Cirer");
    	a.coaNouAlumne("1231231L", "Pedro picapiedra");
    	
    	// Intentam afegir 1 alumne null
    	a.coaNouAlumne("1231231L", null);
    	// Recuperam els alumnes per ordre d'arribada
    	a.coaRecuperarAlumne();
    }
    
}
