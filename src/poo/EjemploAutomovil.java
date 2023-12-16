package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.fabricante = "Subaru";
        automovil.modelo = "Impreza";
        automovil.cilindrada = 2.0;
        automovil.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println("automovil.fabricante = " + automovil.fabricante);
        System.out.println("auto.modelo = "+automovil.modelo);
        System.out.println("automovil.color = " + automovil.color);
        System.out.println("automovil.cilindrada = " + automovil.cilindrada);

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
    }
}
