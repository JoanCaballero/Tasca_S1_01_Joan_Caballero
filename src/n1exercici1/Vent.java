package n1exercici1;

public class Vent extends Instruments{

    public Vent(String nom, float preu) {
        super(nom, preu);
    }

    {System.out.println("Vent inicialitzat");}

    @Override
    public String tocar() {
        return "Està sonant un instrument de vent";
    }
}
