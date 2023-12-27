package paquetes.org.ayeren.app.jardin;

import paquetes.org.ayeren.app.hogar.*;

import static paquetes.org.ayeren.app.hogar.ColorPelo.*;
import static paquetes.org.ayeren.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Anthony");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());


        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = "+jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
