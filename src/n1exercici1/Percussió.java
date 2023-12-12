package n1exercici1;

public class Percussió extends Instrument {

    public Percussió(String nom, float preu) {
        super(nom, preu);
    }

    static{System.out.println("Percussió inicialitzat");}


    @Override
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }
}
