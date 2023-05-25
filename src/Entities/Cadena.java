package Entities;

public class Cadena {

    private String frase;
    private Integer longitud;
    private Integer vocales;
    private String fraseInvertida;

    public Cadena() {
    }

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "frase='" + frase + '\'' +
                ", longitud=" + longitud +
                ", vocales=" + vocales +
                ", fraseInvertida='" + fraseInvertida + '\'' +
                '}';
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getVocales() {
        return vocales;
    }

    public void setVocales(Integer vocales) {
        this.vocales = vocales;
    }

    public String getFraseInvertida() {
        return fraseInvertida;
    }

    public void setFraseInvertida(String fraseInvertida) {
        this.fraseInvertida = fraseInvertida;
    }
}
