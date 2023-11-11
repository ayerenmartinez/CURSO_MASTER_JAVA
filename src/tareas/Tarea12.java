package tareas;

import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {
        //Calcular el área de un Círculo
        /*
        * Pedir el radio de un círculo y calcular su área
        * utilizar la fórmula:
        * area = PI * r2 (Constante PI multiplicado por el radio al cuadrado)
        */
        Scanner leer = new Scanner(System.in);
        Double radio, area;
        System.out.println("Ingrese el radio del círculo: ");
        radio = leer.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("area = " + area);
    }
}
