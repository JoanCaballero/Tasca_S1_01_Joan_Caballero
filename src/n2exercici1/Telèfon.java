package n2exercici1;

public abstract class Telèfon {

    private String marca, model;

    public Telèfon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    abstract String trucar(String num);
}
