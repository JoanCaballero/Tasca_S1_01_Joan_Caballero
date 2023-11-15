package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    public static void main(String[] args) {
        int opcio, opcio2, opcio3;
        boolean valid = false;
        String nom, DNI, titular, text, comp, equip, jug;
        Redactor red;
        Scanner sca = new Scanner(System.in);
        do {
            System.out.println("""
                    MENU D'OPCIONS
                    1.- Introduir redactor.
                    2.- Eliminar redactor.
                    3.- Introduir noticia a un redactor.
                    4.- Eliminar noticia.
                    5.- Mostrar totes les noticies per redactor.
                    6.- Calcular puntuació de la notícia.
                    7.- Calcular preu de la notícia.
                    8.- Sortir.""");
            opcio = sca.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println("Introdueix el nom del Redactor");
                    nom = sca.nextLine();
                    System.out.println("Introdueix el DNI del redactor");
                    DNI = sca.nextLine();
                    red = new Redactor(nom, DNI);
                    afegirRedactor(red);
                    break;
                case 2:
                    System.out.println("Introdueix el DNI del redactor");
                    DNI = sca.nextLine();
                    eliminarRedactor(DNI);
                    break;
                case 3:
                    do {
                        System.out.println("Introdueix el DNI del redactor");
                        DNI = sca.nextLine();
                        if (identificarRedactor(DNI) != null) {
                            valid = true;
                        }
                    }while(!valid);
                    valid = false;
                    red = identificarRedactor(DNI);
                    do{
                    System.out.println("""
                            Quin dels següents esports tracta la noticia?
                            1.- Futbol.
                            2.- Basquet.
                            3.- Tenis.
                            4.- Motociclisme.
                            5.- Fòrmula 1.""");
                    opcio2 = sca.nextInt();
                        switch (opcio2) {
                            case 1 -> {
                                System.out.println("Introdueix el titular de la Noticia: ");
                                titular = sca.nextLine();
                                System.out.println("Introdueix el text de la Noticia:");
                                text = sca.nextLine();
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Champions League.
                                        2.- Lliga Espanyola.
                                        3.- Una altre competició.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    comp = "Champions";
                                } else if (opcio3 == 2) {
                                    comp = "Lliga";
                                } else {
                                    comp = "altre";
                                }
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- El Barça i/o el Madrid.
                                        2.- Altres equips.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    equip = "Barça";
                                } else {
                                    equip = "altre";
                                }
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Ferran Torres i/o Benzema.
                                        2.- Altres jugadors.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    jug = "Benzema";
                                } else {
                                    jug = "altre";
                                }
                                Futbol notiF = new Futbol(titular, text, comp, equip, jug);
                                red.introduirNoticia(notiF);
                            }
                            case 2 -> {
                                System.out.println("Introdueix el titular de la Noticia: ");
                                titular = sca.nextLine();
                                System.out.println("Introdueix el text de la Noticia:");
                                text = sca.nextLine();
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Eurolliga.
                                        2.- ACB.
                                        3.- Una altre competició.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    comp = "Eurolliga";
                                } else if (opcio3 == 2) {
                                    comp = "ACB";
                                } else {
                                    comp = "altre";
                                }
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- El Barça i/o el Madrid.
                                        2.- Altres equips.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    equip = "Barça";
                                } else {
                                    equip = "altre";
                                }
                                Basquet notiB = new Basquet(titular, text, comp, equip);
                                red.introduirNoticia(notiB);
                            }
                            case 3 -> {
                                System.out.println("Introdueix el titular de la Noticia: ");
                                titular = sca.nextLine();
                                System.out.println("Introdueix el text de la Noticia:");
                                text = sca.nextLine();
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Nadal i/o Djokovic i/o Federer.
                                        2.- Altres jugadors.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    jug = "Nadal";
                                } else {
                                    jug = "altre";
                                }
                                comp = "Roland Garros";
                                Tenis notiT = new Tenis(titular, text, comp, jug, jug);
                                red.introduirNoticia(notiT);
                            }
                            case 4 -> {
                                System.out.println("Introdueix el titular de la Noticia: ");
                                titular = sca.nextLine();
                                System.out.println("Introdueix el text de la Noticia:");
                                text = sca.nextLine();
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Yamaha i/o Honda.
                                        2.- Altres equips.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    equip = "Honda";
                                } else {
                                    equip = "altre";
                                }
                                Motociclisme notiM = new Motociclisme(titular, text, equip);
                                red.introduirNoticia(notiM);
                            }
                            case 5 -> {
                                System.out.println("Introdueix el titular de la Noticia: ");
                                titular = sca.nextLine();
                                System.out.println("Introdueix el text de la Noticia:");
                                text = sca.nextLine();
                                System.out.println("""
                                        Aquesta Noticia tracta de\s
                                        1.- Ferrari i/o Mercedes.
                                        2.- Altres equips.""");
                                opcio3 = sca.nextInt();
                                if (opcio3 == 1) {
                                    equip = "Ferrari";
                                } else {
                                    equip = "altre";
                                }
                                F1 notiF1 = new F1(titular, text, equip);
                                red.introduirNoticia(notiF1);
                            }
                            default -> System.out.println("Introdueix un número vàlid");
                        }
                    }while(opcio2 !=6);
                    break;
                case 4:
                    do {
                        System.out.println("Introdueix el DNI del redactor");
                        DNI = sca.nextLine();
                        if (identificarRedactor(DNI) != null) {
                            valid = true;
                        }
                    }while(!valid);
                    valid = false;
                    do {
                        System.out.println("Introdueix el titular de la Noticia");
                        titular = sca.nextLine();
                        if (identificarNoticia(titular) != null) {
                            valid = true;
                        }
                    }while(!valid);

                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;
                case 8:
                    //
                    break;
                default:
                    System.out.println("Introdueix un número vàlid");

            }
        }while(opcio != 8);


    }

    public static void afegirRedactor(Redactor red){
        redactors.add(red);
        System.out.println("Redactor Afegit");
    }
    public static Redactor identificarRedactor(String DNI){
        for(Redactor red : redactors){
            if(red.getDNI().equalsIgnoreCase(DNI)){
                return red;
            }
        }
        return null;
    }

    public static Noticia identificarNoticia(Redactor red, String titular){
        for(Noticia not : red.getNoticies()){
            if(red.getDNI().equalsIgnoreCase(DNI)){
                return red;
            }
        }
        return null;
    }

    public static void eliminarRedactor(String DNI){
        for (Redactor red : redactors) {
            if (red.getDNI().equalsIgnoreCase(DNI)) {
                redactors.remove(red);
                System.out.println("Redactor Eliminat");
            }
        }
        System.out.println("No s'ha trobat cap redactor a la redacció amb aquest DNI");
    }
}
