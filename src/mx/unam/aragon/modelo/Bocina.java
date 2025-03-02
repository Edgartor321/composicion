package mx.unam.aragon.modelo;

public class Bocina {
    private double decibeles;
    private String marca;
    private int diametro;
    private double impedancia;
    private double voltaje;

    public Bocina(double decibeles,String marca,int diametro,double impedancia,double voltaje){
        this.decibeles=decibeles;
        this.marca=marca;
        this.diametro=diametro;
        this.impedancia=impedancia;
        this.voltaje=voltaje;
    }

    public double getDecibeles() {
        return decibeles;
    }

    public void setDecibeles(double decibeles) {
        this.decibeles = decibeles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getImpedancia() {
        return impedancia;
    }

    public void setImpedancia(double impedancia) {
        this.impedancia = impedancia;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }
}
