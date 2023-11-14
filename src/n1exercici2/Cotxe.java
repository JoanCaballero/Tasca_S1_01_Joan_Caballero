package n1exercici2;

public class Cotxe {

    private final static String marca = "Ford";
    private static String model = "Transit";
    private final int potencia;

    public Cotxe(int potencia){
        this.potencia = potencia;
        System.out.println(marca + ", " + model + ", " + potencia);
    }



    public static String frenar(){
        return "El vehicle està frenant";
    }

    public String accelerar(){
        return "El vehicle està accelerant";
    }
}
