package n3exercici1;

public class Noticia{
    private String titular = "", text = "";
    private int preu = 0, punt = 0;

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void puntuacioIPreuNoticia(Object obj){
        if(obj.getClass() == Futbol.class){
            ((Futbol) obj).calcularPreuNoticia();
            punt = ((Futbol) obj).getPunt();
            preu = ((Futbol) obj).getPreu();

        }
        else if(obj.getClass() == Basquet.class){
            ((Basquet) obj).calcularPreuNoticia();
            punt = ((Basquet) obj).getPunt();
            preu = ((Basquet) obj).getPreu();
        }
        else if(obj.getClass() == Tenis.class){
            ((Tenis) obj).calcularPreuNoticia();
            punt = ((Tenis) obj).getPunt();
            preu = ((Tenis) obj).getPreu();
        }
        else if(obj.getClass() == Motociclisme.class){
            ((Motociclisme) obj).calcularPreuNoticia();
            punt = ((Motociclisme) obj).getPunt();
            preu = ((Motociclisme) obj).getPreu();
        }
        else if(obj.getClass() == F1.class){
            ((F1) obj).calcularPreuNoticia();
            punt = ((F1) obj).getPunt();
            preu = ((F1) obj).getPreu();
        }
    }
}
