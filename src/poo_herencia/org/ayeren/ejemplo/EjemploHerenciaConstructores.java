package poo_herencia.org.ayeren.ejemplo;

import poo_herencia.org.ayeren.pooherencia.Alumno;
import poo_herencia.org.ayeren.pooherencia.AlumnoInternacional;
import poo_herencia.org.ayeren.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Andrés","Guzman",13,"Insituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituo Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("Luci","Pérez","Matemáticas");
        profesor.setEdad(37);
    }
}
