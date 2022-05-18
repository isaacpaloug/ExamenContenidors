package cat.paucasesnovescifp.swpro.secretaria;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

import cat.paucasesnovescifp.swpro.dades.Alumne;
import cat.paucasesnovescifp.swpro.dades.Professor;

public class Secretaria {
	HashMap<String, Alumne> alumnes = new HashMap<>();
	
	HashSet<Professor> profesors = new HashSet<>();
	
	ArrayDeque<Alumne> coa = new ArrayDeque<>();
	
	
	public void afegirProfessor(String dni, String nom, String especialitat) {
		Professor nouProfe = new Professor(dni, nom, especialitat);
		System.out.println(profesors.add(nouProfe));
	}
	
//	public void esborrarProfessor(String dni) {
	//	profesors.remove(dni);
	//}
	
//	public void professorEspecialitat(String especialitat) {
//		for (Alumne valor:alumnes.values()) {
	//	
		//		System.out.println(valor);
			//}
			//}
//
	//}
	
	public void afegirAlumne(String dni,String nom ) {
		Alumne nouAlumne = new Alumne(dni, nom);
		System.out.println(alumnes.put(nouAlumne.getDni(), nouAlumne));
	}
	
	public void recuperarAlumne(String dni) {
		System.out.println(alumnes.get(dni));
	}
	public void esborrarAlumne(String dni) {
		alumnes.remove(dni);
	}
	
	public void coaNouAlumne(String dni,String nom) {
		Alumne nouAlumne = new Alumne(dni, nom);
		if ((dni == null) || (nom == null)) {
			System.out.println("L'alumne no pot contenir valors nulls");
		} else {
			System.out.println(coa.add(nouAlumne));
		}
	}
	public void coaRecuperarAlumne() {
		while (!coa.isEmpty()) {
            System.out.println("seguent: " + coa.remove());
        }
	}
	
	
}
