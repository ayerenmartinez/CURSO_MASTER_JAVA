package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        Automovil nissan = new Automovil("Nissan","Navara","Gris oscuro",3.5,50);

        System.out.println(mazda.detalle2());
        System.out.println();
        System.out.println(subaru.detalle2());
        System.out.println();
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometros por litro: "+subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro: "+subaru.calcularConsumo(300,75));

        System.out.println(nissan.verDetalle());
    }
}
