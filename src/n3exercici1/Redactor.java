package n3exercici1;

import java.util.ArrayList;

public class Redactor {

    private final String nom;
    private final String DNI;
    private int sou;
    private static final int souBase = 1500;
    private ArrayList<Noticia> noticies = new ArrayList<>();

    private Noticia noticiaRemove;

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }


    public Redactor(String nom, String DNI){
        this.nom = nom;
        this.DNI = DNI;
        this.sou = souBase;
    }

    public void introduirNoticia(Noticia not){
        noticies.add(not);
    }

    public boolean eliminarNoticia(String titular){
        boolean bol = false;
        for(Noticia notI : noticies){
            if(titular.equalsIgnoreCase(notI.getTitular())){
                noticiaRemove = notI;
                bol = true;
            }
        }
        if(bol){
            noticies.remove(noticiaRemove);
        }
        return bol;
    }

    public void mostrarNoticies(){
        for (Noticia notI : noticies) {
            System.out.println(notI.getTitular() + "\n " + notI.getText() + "\n");
        }
    }

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return nom;
    }
}
