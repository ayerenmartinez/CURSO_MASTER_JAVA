package tareas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Tarea11 {
    public static void main(String[] args) {
        /*Calcular edad ingresando la fecha de nacimiento de una persona
        *
        * Para esta tarea se pide ingresar una fecha de nacimiento en
        * formato string, convertirla a una fecha del tipo java.util.Date
        * y calcular la edad de la persona de acuerdo a la fecha actual.
        * Intentar usar solo lo visto hasta el momento, no el api de java 8
        * que lo veremos mas adelante, también se pueden apoyar de google
        * que hay varios ejemplos.*/
        Scanner s = new Scanner(System.in);
        String fechaNacimiento = "";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese la edad de una Persona en el formato 'dd-MM-yyyy': ");
        fechaNacimiento = s.next();

        try {
            Date fecha = format.parse(fechaNacimiento);
            Date fechaActual = new Date();
            SimpleDateFormat birthdayYearFormat = new SimpleDateFormat("yyyy");
            Integer birthdayYear = Integer.parseInt(birthdayYearFormat.format(fecha));
            System.out.println("birthdayYear = " + birthdayYear);
            SimpleDateFormat currentYearFormat = new SimpleDateFormat("yyyy");
            Integer currentYear = Integer.parseInt(currentYearFormat.format(fechaActual));
            System.out.println("currentYear = " + currentYear);
            Integer edad = currentYear - birthdayYear;
            System.out.println("La edad de la Persona es: "+ edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
