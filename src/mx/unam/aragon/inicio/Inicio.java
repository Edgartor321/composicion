package mx.unam.aragon.inicio;
import mx.unam.aragon.modelo.*;

public class Inicio {
    public static void main(String[] args) {
        Teclado teclado =new Teclado();
        Mouse raton = new Mouse("rojo","logitech","gamer",10000,false);
        Bocina parlante=new Bocina(1.58,"Bosse",15,370.8,12.5);
        Computadora pc= new Computadora();
        Monitor monitor = new Monitor("verde","Sony","OLED",80,false);
        Monitor monitorDos =new Monitor("gris","LG","LED",12,true);
        Monitor monitorTres =new Monitor("negro","Samsung","QLED",34,false);

        pc.setMouse(raton);
        System.out.println(pc.getMouse());
        pc.setBocina(parlante);
        System.out.println(pc.getBocina());
        //pc.setMonitor(monitor)[0]=monitor;
        System.out.println(pc.getMonitor()[0]=monitor);
        pc.getMonitor()[1]=monitorDos;
        System.out.println(pc.getMonitor()[1]);
        System.out.println(pc.getMonitor()[2]=monitorTres);












    }
}
