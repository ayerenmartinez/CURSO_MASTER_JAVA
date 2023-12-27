package paquetes.org.ayeren.app.hogar;

import paquetes.org.ayeren.app.jardin.Perro;

import static paquetes.org.ayeren.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();
    }
}
