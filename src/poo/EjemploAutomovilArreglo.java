package poo;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        Persona conductorSubaru = new Persona("Luci","Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea","Gonzales");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo","Mena");
        Automovil suzuki = new Automovil("Suzuki","Vitara",Color.GRIS,
                new Motor(1.6,TipoMotor.BENCINA),new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);

        Automovil audi = new Automovil("Audi","A3");
        audi.setConductor(new Persona("Jano","Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}
