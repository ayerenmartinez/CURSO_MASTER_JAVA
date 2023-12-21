package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setEstanque(new Estanque());

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        Motor motorMazda = new Motor(3.0,TipoMotor.BENCINA);
        mazda.setMotor(motorMazda);
        mazda.setColor(Color.ROJO);

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(3.0,TipoMotor.DIESEL),new Estanque());
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.DIESEL),new Estanque());
        Automovil nissan3 = new Automovil();

        System.out.println("son iguales => "+(nissan == nissan2));
        System.out.println("son iguales => "+(nissan.equals(nissan2)));
        System.out.println("son iguales sobrescribiendo con equals=> "+(nissan.equals(nissan2)));
        System.out.println("son iguales => "+ nissan3.equals(nissan2));

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
