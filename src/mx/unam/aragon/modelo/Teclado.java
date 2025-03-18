package mx.unam.aragon.modelo;

public class Teclado {
    private String distribucion;
    private int cantidad_teclas;
    private String color;
    private String marca;
    private boolean tiene_enie;

    public Teclado(String distribucion,int cantidad_teclas,String color,String marca,boolean tiene_enie){
        this.cantidad_teclas=cantidad_teclas;
        this.marca=marca;
        this.color=color;
        this.distribucion=distribucion;
        this.tiene_enie=tiene_enie;

    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public int getCantidad_teclas() {
        return cantidad_teclas;
    }

    public void setCantidad_teclas(int cantidad_teclas) {
        this.cantidad_teclas = cantidad_teclas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTiene_enie() {
        return tiene_enie;
    }

    public void setTiene_enie(boolean tiene_enie) {
        this.tiene_enie = tiene_enie;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "distribucion='" + distribucion + '\'' +
                ", cantidad_teclas=" + cantidad_teclas +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", tiene_enie=" + tiene_enie +
                '}';
    }
}
