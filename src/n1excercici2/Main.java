package n1excercici2;

public class Main {
    public static void main(String[] args) {
        Cotxe car = new Cotxe(60);
        Cotxe car2 = new Cotxe("Fiesta", 80);
        Cotxe.frenar();
        car.accelerar();
        car2.accelerar();
    }
}
