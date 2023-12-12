package n1exercici1;

public class Corda extends Instrument {

    public Corda(String nom, float preu) {
        super(nom, preu);
    }

    static{System.out.println("Corda inicialitzat");}

    @Override
    public String tocar() {
        return "Està sonant un instrument de corda";
    }
}
