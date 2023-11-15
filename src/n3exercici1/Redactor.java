package n3exercici1;

import java.util.ArrayList;

public class Redactor {

    private String nom;
    private final String DNI;
    private int sou;
    private static final int souBase = 1500;
    private ArrayList<Noticia> noticies = new ArrayList<Noticia>();

    public Redactor(String nom, String DNI, int sou) {
        this.nom = nom;
        this.DNI = DNI;
        this.sou = sou;
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
        for(int i = 0; i< noticies.size(); i++){
            Noticia notI = noticies.get(i);
            System.out.println(notI.getTitular() + "\n " + notI.getText());
        }
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
