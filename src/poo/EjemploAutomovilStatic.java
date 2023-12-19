package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil.setColorPatente(Color.AMARILLO);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.AZUL);
        System.out.println(subaru.verDetalle());
        System.out.println();
        Automovil mazda = new Automovil("Mazda","BT-50",Automovil.COLOR_ROJO,3.0);
        System.out.println(mazda.verDetalle());
        System.out.println("Automovil.getColorPatente() => "+Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litro => "+Automovil.calcularConsumoEstatico(300,60));
        System.out.println("VELOCIDAD MÁXIMA EN CARRETERA => "+Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("VELOCIDAD MÁXIMA EN CIUDAD => "+Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
