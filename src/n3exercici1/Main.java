package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sca = new Scanner(System.in);
    static ArrayList<Redactor> redactors = new ArrayList<>();
    public static void main(String[] args) {
        int opcio;
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
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticies();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 8:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Introdueix un número vàlid");
            }
        }while(opcio != 8);


    }

    private static void introduirRedactor(){
        System.out.println("Introdueix el nom del Redactor");
        sca.nextLine();
        String nom = sca.nextLine();
        System.out.println("Introdueix el DNI del redactor");
        String DNI = sca.nextLine();
        Redactor red = new Redactor(nom, DNI);
        afegirRedactor(red);
    }

    private static void eliminarRedactor(){
        boolean valid = false;
        do {
            System.out.println("Introdueix el DNI del redactor");
            sca.nextLine();
            String DNI = sca.nextLine();
            if (identificarRedactor(DNI) != null) {
                eliminarRedactorTrobat(DNI);
                valid = true;
            }else if (DNI.equals("Surt")) {
                valid = true;
            }
        }while(!valid);
    }

    private static void introduirNoticia(){
        String DNI, titular, text, comp, equip,jug;
        Redactor red;
        boolean valid = false;
        int opcio2, opcio3;
        do {
            System.out.println("Introdueix el DNI del redactor");
            sca.nextLine();
            DNI = sca.nextLine();
            if (identificarRedactor(DNI) != null) {
                valid = true;
            }
        }while(!valid);
        red = identificarRedactor(DNI);
        System.out.println("Introdueix el titular de la Noticia: ");
        //sca.nextLine();
        titular = sca.nextLine();
        //sca.nextLine();
        System.out.println("Introdueix el text de la Noticia:");
        text = sca.nextLine();
        //sca.nextLine();
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
                    } else {
                        equip = "altre";
                        jug = "altre";
                    }

                    Futbol notiF = new Futbol(titular, text, comp, equip, jug);
                    assert red != null;
                    red.introduirNoticia(notiF);
                    opcio2 = 6;
                }
                case 2 -> {
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
                    assert red != null;
                    red.introduirNoticia(notiB);
                    opcio2 = 6;
                }
                case 3 -> {
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
                    assert red != null;
                    red.introduirNoticia(notiT);
                    opcio2 = 6;
                }
                case 4 -> {
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
                    assert red != null;
                    red.introduirNoticia(notiM);
                    opcio2 = 6;
                }
                case 5 -> {
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
                    assert red != null;
                    red.introduirNoticia(notiF1);
                    opcio2 = 6;
                }
                default -> System.out.println("Introdueix un número vàlid");
            }
        }while(opcio2 !=6);
    }

    public static void eliminarNoticia(){
        String DNI, titular;
        boolean valid =false;
        Redactor red;
        do {
            System.out.println("Introdueix el DNI del redactor");
            sca.nextLine();
            DNI = sca.nextLine();
            if (identificarRedactor(DNI) != null) {
                valid = true;
            }
        }while(!valid);
        red = identificarRedactor(DNI);
        valid = false;
        do {
            System.out.println("Introdueix el titular de la Noticia");
            titular = sca.nextLine();
            if (identificarNoticia(red, titular) != null) {
                if(red.eliminarNoticia(titular)){
                    System.out.println("Noticia amb el titular: " + titular + " eliminada del redactor amb DNI: " + DNI + ".");
                    valid = true;
                }
                else{System.out.println("No s'ha trobat la Noticia amb aquest titular");}
            } else if (titular.equals("Surt")) {
                valid = true;
            }
        }while(!valid);
    }

    private static void mostrarNoticies(){
        for(Redactor redactor : redactors){
            System.out.println(redactor.getNom().toUpperCase() + ":\n");
            redactor.mostrarNoticies();
        }
    }

    private static void calcularPuntuacioNoticia(){
        String DNI, titular;
        boolean valid = false;
        Redactor red;
        do {
            System.out.println("Introdueix el DNI del redactor");
            sca.nextLine();
            DNI = sca.nextLine();
            if (identificarRedactor(DNI) != null) {
                valid = true;
            }
        }while(!valid);
        red = identificarRedactor(DNI);
        valid = false;
        do {
            System.out.println("Introdueix el titular de la Noticia");
            titular = sca.nextLine();
            if (identificarNoticia(red, titular) != null) {
                Noticia noticia = identificarNoticia(red,titular);
                noticia.puntuacioIPreuNoticia(noticia);
                System.out.println("Puntuació de la Noticia: " + noticia.getPunt());
                valid = true;
            } else if (titular.equals("Surt")) {
                valid = true;
            }
        }while(!valid);
    }

    private static void calcularPreuNoticia(){
        String DNI, titular;
        boolean valid = false;
        Redactor red;
        do {
            System.out.println("Introdueix el DNI del redactor");
            sca.nextLine();
            DNI = sca.nextLine();
            if (identificarRedactor(DNI) != null) {
                valid = true;
            }
        }while(!valid);
        red = identificarRedactor(DNI);
        valid = false;
        do {
            System.out.println("Introdueix el titular de la Noticia");
            titular = sca.nextLine();
            if (identificarNoticia(red, titular) != null) {
                Noticia noticia = identificarNoticia(red,titular);
                noticia.puntuacioIPreuNoticia(noticia);
                System.out.println("Preu de la Noticia: " + noticia.getPreu());
                valid = true;
            } else if (titular.equals("Surt")) {
                valid = true;
            }
        }while(!valid);
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
            if(not.getTitular().equalsIgnoreCase(titular)){
                return not;
            }
        }
        System.out.println("No existeix una Noticia d'aquest redactor amb el titular donat.");
        return null;
    }

    public static void eliminarRedactorTrobat(String DNI){
        boolean trobat = false;
        Redactor redRemove = null;
        for (Redactor red : redactors) {
            if (red.getDNI().equalsIgnoreCase(DNI)) {
                redRemove = red;
                trobat = true;
            }
        }
        if(trobat){
            redactors.remove(redRemove);
            System.out.println("Redactor amb DNI " + DNI + " eliminat.");
        }
        else{System.out.println("No s'ha trobat cap redactor a la redacció amb aquest DNI");}
    }
}
