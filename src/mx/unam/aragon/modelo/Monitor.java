package mx.unam.aragon.modelo;

public class Monitor {
    private String color;
    private String marca;
    private String tipo;
    private int dpi;
    private boolean inalambrico;

    public Monitor(String color, String marca, String tipo,int dpi,boolean inalambrico){
        this.color=color;
        this.marca=marca;
        this.dpi=dpi;
        this.tipo=tipo;
        this.inalambrico=inalambrico;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", dpi=" + dpi +
                ", inalambrico=" + inalambrico +
                '}';
    }
}
