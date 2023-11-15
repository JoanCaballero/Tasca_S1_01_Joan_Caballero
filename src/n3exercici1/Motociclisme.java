package n3exercici1;

public class Motociclisme extends Noticia implements calculPreu{

    private String equip;
    private static final int preuBase = 100;
    private static final int puntBase = 3;

    private int preu, punt;

    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
        this.preu = preuBase;
        this.punt = puntBase;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
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
        if(this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")) {
            this.preu += 50;
            this.punt += 3;
        }
    }
}
