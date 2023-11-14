package n3exercici1;

public class Futbol extends Noticia implements calculPreu{

    private String comp, club, jug;
    private static final int preuBase = 300;
    private static final int puntBase = 5;
    private int preu, punt;

    public Futbol(String titular, String text, String comp, String club, String jug) {
        super(titular, text);
        this.club = club;
        this.comp = comp;
        this.jug = jug;
        this.preu = preuBase;
        this.punt = puntBase;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getJug() {
        return jug;
    }

    public void setJug(String jug) {
        this.jug = jug;
    }

    @Override
    public void calcularPreuNoticia() {
        if(this.comp.equalsIgnoreCase("Champions")){
            this.preu+= 100;
            this.punt+= 3;
        }
        if(this.comp.equalsIgnoreCase("Lliga")){
            this.punt+= 2;
        }
        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            this.preu+= 100;
            this.punt+= 1;
        }
        if(this.jug.equalsIgnoreCase("Ferran Torres") || this.jug.equalsIgnoreCase("Benzema")){
            this.preu+= 50;
            this.punt+= 1;
        }
    }
}
