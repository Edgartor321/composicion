package mx.unam.aragon.inicio;
import mx.unam.aragon.modelo.*;

public class Inicio {
    public static void main(String[] args) {
        Teclado teclado =new Teclado("QWERTY",68,"Negro","Sin marca",true);
        Mouse raton = new Mouse("rojo","logitech","gamer",10000,false);
        Bocina parlante=new Bocina(1.58,"Bosse",15,370.8,12.5);
        Procesador cpu =new Procesador("Intel","I9-12900K",8,3200,false);
        Computadora pc= new Computadora();
        Monitor monitor = new Monitor("verde","Sony","OLED",80,false);
        Monitor monitorDos =new Monitor("gris","LG","LED",12,true);

        pc.setMouse(raton);
        System.out.println(pc.getMouse());
        pc.setBocina(parlante);
        System.out.println(pc.getBocina());
        System.out.println(pc.getMonitor()[0]=monitor);
        pc.getMonitor()[1]=monitorDos;
        System.out.println(pc.getMonitor()[1]);
        pc.setTeclado(teclado);
        pc.setProcesador(cpu);
        System.out.println(pc.getTeclado());
        System.out.println(pc.getProcesador());
        System.out.println();

        System.out.println(pc.toString());












    }
}
