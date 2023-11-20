package n3exercici1;

public class Basquet extends Noticia implements calculPreu{

    private final String comp, club;
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

    public int getPreu() {
        return preu;
    }
    public int getPunt() {
        return punt;
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
