package n3exercici1;

public class Basquet extends Noticia implements calculPreu{

    private String comp, club;
    private static final int preuBase = 250;
    private static final int puntBase = 4;
    private int preu, punt;

    public Basquet(String titular, String text, String comp, String club) {
        super(titular, text);
        this.comp = comp;
        this.club = club;
        this.preu = preuBase;
        this.punt = puntBase;
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

    @Override
    public void calcularPreuNoticia() {
        if(this.comp.equalsIgnoreCase("Eurolliga")){
            this.preu+= 75;
            this.punt+= 3;
        }
        if(this.comp.equalsIgnoreCase("ACB")){
            this.punt+= 2;
        }
        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            this.preu += 75;
            this.punt += 1;
        }
    }
}
