package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(mazda.detalle2());
        System.out.println();
        System.out.println(subaru.detalle2());
    }
}
