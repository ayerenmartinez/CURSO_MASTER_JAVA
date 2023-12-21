package poo;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Rueda[] ruesdasSubaru = new Rueda[5];
        for (int i = 0; i < ruesdasSubaru.length; i++) {
            ruesdasSubaru[i] = new Rueda("Yokohama",16,7.5);
        }
        Persona conductorSubaru = new Persona("Luci","Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruesdasSubaru);



        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin",18,10.5));
        }

        Rueda[] ruedasNissan = {
            new Rueda("Pirelli",20,11.5),
            new Rueda("Pirelli",20,11.5),
            new Rueda("Pirelli",20,11.5),
            new Rueda("Pirelli",20,11.5),
            new Rueda("Pirelli",20,11.5)
        };
        Persona bea = new Persona("Bea","Gonzales");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0,TipoMotor.DIESEL),new Estanque(50),bea,ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Rueda[] ruedasNissan2 = {
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5)
        };
        Persona lalo = new Persona("Lalo","Mena");
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50),lalo,ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        //Llamando métodos encadenados
        nissan2.addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5))
                .addRueda(new Rueda("Pirelli",20,11.5));
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*
        System.out.println("Conductor subaru: "+subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for (Rueda rueda:subaru.getRuedas()) {
            System.out.println(rueda.getFabricante()+", aro: "+ rueda.getAro()+", ancho: "+ rueda.getAncho());
        }
         */
    }
}
