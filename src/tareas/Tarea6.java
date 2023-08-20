package tareas;

import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {
        /*
          Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
          Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros
          de la familia o amigos usando la clase JOptionPane y método showInputDialog().
          Calcular e Imprimir el nombre de la persona que tenga el nombre más largo
          (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
          Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
          y con el indice cero accedemos al nombre de la persona.
          Restricción no usar loops en el desarrollo de la tarea.
          Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
        */

        String nombreCompleto1 = "", nombreCompleto2 = "", nombreCompleto3 = "";
        nombreCompleto1  = JOptionPane.showInputDialog("Ingrese el Nombre completo de la Primera persona: ");
        nombreCompleto2  = JOptionPane.showInputDialog("Ingrese el Nombre completo de la Segunda persona: ");
        nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el Nombre completo de la Tercera persona: ");

        //PROCESO
        String[] nombrePrimeraPersonaArray = nombreCompleto1.split(" ");
        String nombrePrimeraPersona = nombrePrimeraPersonaArray[0];
        String[] nombreSegundaPersonaArray = nombreCompleto2.split(" ");
        String nombreSegundaPersona = nombreSegundaPersonaArray[0];
        String[] nombreTerceraPersonaArray = nombreCompleto3.split(" ");
        String nombreTerceraPersona = nombreTerceraPersonaArray[0];


        String resultado = "";
        if(nombrePrimeraPersona.length() > nombreSegundaPersona.length() && nombrePrimeraPersona.length() > nombreTerceraPersona.length()){
            resultado =  nombreCompleto1 + " tiene el nombre más largo";
        }else if(nombreSegundaPersona.length() > nombrePrimeraPersona.length() && nombreSegundaPersona.length() > nombreTerceraPersona.length()){
            resultado =  nombreCompleto2 + " tiene el nombre más largo";
        }else{
            resultado =  nombreCompleto3 + " tiene el nombre más largo";
        }
        JOptionPane.showMessageDialog(null,resultado);

        /*
         String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
         */
    }
}
