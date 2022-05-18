package cat.paucasesnovescifp.swpro.dades;

public class Alumne {
    private String dni;
    private String nomComplet;

    public Alumne(String dni, String nomComplet) {
        this.dni=dni;
        this.setNomComplet(nomComplet);
    }

    public String getDni() {
        return dni;
    }


    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "dni='" + dni + '\'' +
                ", nomComplet='" + nomComplet + '\'' +
                '}';
    }
}
