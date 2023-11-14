package n1excercici2;

public class Cotxe {

    final static String marca = "Ford";
    static String model = "Transit";
    final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
        System.out.println(marca + ", " + model + ", " + potencia);
    }

    public Cotxe(String model, int potencia){
        this.potencia = potencia;
        this.model = model;
        System.out.println(marca + ", " + model + ", " + potencia);
    }



    public static String frenar(){
        System.out.println("El vehicle està frenant");
        return null;
    }

    public String accelerar(){
        System.out.println("El vehicle està accelerant");
        return null;
    }
}
