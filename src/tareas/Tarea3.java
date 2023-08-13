package tareas;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        /*Se requiere desarrollar un programa que reciba los nombres de los integrantes de tu familia y formatearlos
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
        .Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos
        como argumentos de línea de comandos.
        .Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero
        convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        Por ejemplo para Andres debe quedar como N.es
        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
        N.es_A.ia_E.pe
        */

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Nombre del Primer Integrante: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el Nombre del Segundo Integrante: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el Nombre del Tercer Integrante: ");
        String nombre3 = scanner.nextLine();
        String nombre1Formateado = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        String nombre2Formateado = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        String nombre3Formateado = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        String resultado = nombre1Formateado.concat("_").concat(nombre2Formateado).concat(".").concat("_").concat(nombre3Formateado);
        System.out.println("resultado = " + resultado);
    }
}
