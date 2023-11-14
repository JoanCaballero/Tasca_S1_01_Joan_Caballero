package n3exercici1;

public class Noticia {
    private String titular = "", text = "";

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
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
}
