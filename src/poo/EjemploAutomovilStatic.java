package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setColorPatente("Amarillo");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");
        System.out.println(subaru.verDetalle());
        System.out.println();
        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);
        System.out.println(subaru.verDetalle());
    }
}
