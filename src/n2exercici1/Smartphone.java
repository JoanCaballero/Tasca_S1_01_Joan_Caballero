package n2exercici1;

public class Smartphone extends Telèfon implements Rellotge, Camera{

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }

    @Override
    String trucar(String num) {
        String mstg = "S'està trucant al número: " + num;
        System.out.println("S'està trucant al número: " + num);
        return mstg;
    }
}
