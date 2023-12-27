package paquetes.org.ayeren.app.jardin;

import paquetes.org.ayeren.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
