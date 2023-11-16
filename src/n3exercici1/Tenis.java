package n3exercici1;

public class Tenis extends Noticia implements calculPreu{

    private final String comp, jug1, jug2;
    private static final int preuBase = 150;
    private static final int puntBase = 4;
    private int preu, punt;

    public Tenis(String titular, String text, String comp, String jug1, String jug2) {
        super(titular, text);
        this.comp = comp;
        this.jug1 = jug1;
        this.jug2 = jug2;
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
        if(this.jug1.equalsIgnoreCase("Federer") || this.jug1.equalsIgnoreCase("Nadal") || this.jug1.equalsIgnoreCase("Djokovic") || this.jug2.equalsIgnoreCase("Federer") || this.jug2.equalsIgnoreCase("Nadal") || this.jug2.equalsIgnoreCase("Djokovic")) {
            this.preu += 100;
            this.punt += 3;
        }
    }
}
