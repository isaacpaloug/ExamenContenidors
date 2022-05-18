package cat.paucasesnovescifp.swpro.dades;

import java.util.Objects;

public class Professor {
    private String dni;
    private String nomComplet;
    private String especialitat;


    public Professor(String dni, String nomComplet, String especialitat) {
        this.dni = dni;
        this.nomComplet = nomComplet;
        this.especialitat = especialitat;
    }

    public String getDni() {
        return dni;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }
    

    @Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
    public String toString() {
        return "Professor{" +
                "dni='" + dni + '\'' +
                ", nomComplet='" + nomComplet + '\'' +
                ", especialitat='" + especialitat + '\'' +
                '}';
    }
}
