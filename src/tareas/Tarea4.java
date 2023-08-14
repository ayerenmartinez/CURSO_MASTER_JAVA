package tareas;

import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        /*
        Pedir dos números y mostrarlos ordenados de mayor a menor
        El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        Podría ser utilizando operador ternario.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Primer Número: ");
        Integer num1 = scanner.nextInt();
        System.out.println("Ingrese el Segundo Número: ");
        Integer num2 = scanner.nextInt();

        String resultado = num1 > num2 ? num1 + " y " + num2 : num2 + " y "+ num1;
        System.out.println("resultado = " + resultado);
    }
}
