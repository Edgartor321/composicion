package mx.unam.aragon.modelo;

import java.util.Arrays;

public class Computadora {
    private Mouse mouse;
    private Bocina bocina;
    private Monitor[] monitor=new Monitor[2];
    private Teclado teclado;
    private Procesador procesador;

    public Computadora(){

    }
    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Bocina getBocina() {
        return bocina;
    }

    public void setBocina(Bocina bocina) {
        this.bocina = bocina;
    }

    public Monitor[] getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor[] monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "mouse=" + mouse +
                ", bocina=" + bocina +
                ", monitor=" + Arrays.toString(monitor) +
                ", teclado=" + teclado +
                ", procesador=" + procesador +
                '}';
    }
}
