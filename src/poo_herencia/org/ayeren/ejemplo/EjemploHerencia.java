package poo_herencia.org.ayeren.ejemplo;

import poo_herencia.org.ayeren.pooherencia.Alumno;
import poo_herencia.org.ayeren.pooherencia.AlumnoInternacional;
import poo_herencia.org.ayeren.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Anthony");
        alumno.setApellido("Yeren");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemática");

        System.out.println(alumno.getNombre()+" "+alumno.getApellido()
        +" "+alumno.getInstitucion());

        System.out.println(alumnoInternacional.getNombre()
                +" "+alumnoInternacional.getApellido()
                +" "+alumnoInternacional.getInstitucion()
                +" "+alumnoInternacional.getPais());


        System.out.println("Profesor "+profesor.getAsignatura()
        + ": "+profesor.getNombre()
        + " "+profesor.getApellido());

        Class clase = alumnoInternacional.getClass();

        //Recorrer la jerarquia de la clase AlumnoInternacional
        while (clase.getSuperclass() != null){ //mientras tenga padre
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase Padre "+padre);
            clase = clase.getSuperclass();
        }
    }
}
