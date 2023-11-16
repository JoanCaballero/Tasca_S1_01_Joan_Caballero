package n3exercici1;

public class Motociclisme extends Noticia implements calculPreu{

    private final String equip;
    private static final int preuBase = 100;
    private static final int puntBase = 3;

    private int preu, punt;

    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
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
        if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            this.preu += 50;
            this.punt += 3;
        }
    }
}
