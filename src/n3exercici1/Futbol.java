package n3exercici1;

public class Futbol extends Noticia implements calculPreu{

    private final String comp, club, jug;
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
    public int getPunt() {
        return punt;
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
