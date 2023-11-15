package n3exercici1;

public class F1 extends Noticia implements calculPreu{

    private String escu;
    private static final int preuBase = 100;
    private static final int puntBase = 4;
    private int preu, punt;

    public String getEscu() {
        return escu;
    }

    public void setEscu(String escu) {
        this.escu = escu;
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

    public F1(String titular, String text, String escu) {
        super(titular, text);
        this.escu = escu;
        this.preu = preuBase;
        this.punt = puntBase;
    }

    @Override
    public void calcularPreuNoticia() {
        if(this.escu.equalsIgnoreCase("Ferrari") || this.escu.equalsIgnoreCase("Mercedes")) {
            this.preu += 50;
            this.punt += 2;
        }
    }
}
