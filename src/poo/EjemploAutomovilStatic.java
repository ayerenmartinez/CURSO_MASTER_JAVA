package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil.setColorPatente(Color.AMARILLO);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println(subaru.verDetalle());
        System.out.println();
        Automovil mazda = new Automovil("Mazda","BT-50",Automovil.COLOR_ROJO,new Motor(3.0,TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println(mazda.verDetalle());
        System.out.println("Automovil.getColorPatente() => "+Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litro => "+Automovil.calcularConsumoEstatico(300,60));
        System.out.println("VELOCIDAD MÁXIMA EN CARRETERA => "+Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("VELOCIDAD MÁXIMA EN CIUDAD => "+Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: "+tipoSubaru.getNombre());
    }
}
