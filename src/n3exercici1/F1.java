package n3exercici1;

public class F1 extends Noticia implements calculPreu{

    private final String escu;
    private static final int preuBase = 100;
    private static final int puntBase = 4;
    private int preu, punt;

    public F1(String titular, String text, String escu) {
        super(titular, text);
        this.escu = escu;
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
        if(this.escu.equalsIgnoreCase("Ferrari") || this.escu.equalsIgnoreCase("Mercedes")) {
            this.preu += 50;
            this.punt += 2;
        }
    }
}
