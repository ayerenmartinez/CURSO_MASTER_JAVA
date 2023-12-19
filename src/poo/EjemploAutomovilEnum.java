package poo;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil.setColorPatente(Color.AMARILLO);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println(subaru.verDetalle());

        System.out.println();

        Automovil mazda = new Automovil("Mazda","BT-50",Automovil.COLOR_ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println(mazda.verDetalle());

        TipoAutomovil tipoSubaru = subaru.getTipo();

        switch (tipoSubaru){
            case CONVERTIBLE:{
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            }
            case COUPE:{
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            }
            case FURGON:{
                System.out.println("Es un automovil utilitario de transporte de empresas");
                break;
            }
            case HATCHBACK:{
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            }
            case PICKUP:{
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            }
        }

    }
}
