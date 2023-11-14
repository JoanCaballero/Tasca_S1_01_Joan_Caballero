package n1exercici1;

public abstract class Instruments {

    private String nom;
    private float preu;

    public Instruments(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    abstract String tocar();

    public String getNom() {
        return nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
}
