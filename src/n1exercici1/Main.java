package n1exercici1;

import n1exercici1.Corda;
import n1exercici1.Instruments;
import n1exercici1.Percussió;
import n1exercici1.Vent;

public class Main {
    public static void main(String[] args) {

        Vent flauta = new Vent("flauta", 17);
        Percussió timbal = new Percussió("timbal", 75);
        Corda violí = new Corda("violí", 150);
        Vent oboé = new Vent("oboé", 45);
        Percussió tambor = new Percussió("tambor", 2);

        System.out.println(flauta.tocar());
        System.out.println(timbal.tocar());
        System.out.println(violí.tocar());
        System.out.println(oboé.tocar());
        System.out.println(tambor.tocar());
    }
}