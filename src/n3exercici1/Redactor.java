package n3exercici1;

import java.util.ArrayList;

public class Redactor {

    private String nom;
    private final String DNI;
    private int sou;
    private static final int souBase = 1500;
    private ArrayList<Noticia> noticies = new ArrayList<>();


    public Redactor(String nom, String DNI){
        this.nom = nom;
        this.DNI = DNI;
        this.sou = souBase;
    }

    public void introduirNoticia(Noticia not){
        noticies.add(not);
    }

    public void eliminarNoticia(String titular){
        boolean bol = false;
        for(int i = 0; i< noticies.size() || bol; i++){
            Noticia notI = noticies.get(i);
            String titI = notI.getTitular();
            if(titular.equalsIgnoreCase(titI)){
                noticies.remove(i);
                bol = true;
            }
        }
    }

    public void mostrarNoticies(){
        for (Noticia notI : noticies) {
            System.out.println(notI.getTitular() + "\n " + notI.getText());
        }
    }

    public int puntNoticia(Noticia noti){
        noti.puntuacioIPreuNoticia(noti);
        return noti.getPunt();
    }

    public int preuNoticia(Noticia noti){
        noti.puntuacioIPreuNoticia(noti);
        return noti.getPreu();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }
}
