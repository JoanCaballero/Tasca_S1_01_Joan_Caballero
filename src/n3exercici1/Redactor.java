package n3exercici1;

public class Redactor {

    private String nom;
    private final String DNI;
    private int sou;
    private static final int souBase = 1500;

    public Redactor(String nom, String DNI, int sou) {
        this.nom = nom;
        this.DNI = DNI;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }
}
