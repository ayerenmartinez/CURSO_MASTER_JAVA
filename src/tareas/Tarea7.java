package tareas;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        /*
        *  El desafío es buscar el número menor de mínimo 10 valores enteros.
        *
        *  Crear una clase con el método main donde el desafío es buscar el
        *  número menor de mínimo 10 valores enteros, usando la clase Scanner
        *  ingresar la cantidad de números a comparar, luego utilizando una
        *  sentencia for iterar el numero de veces (ingresado) para pedir el
        *  numero entero, entonces se requiere:
        *  Calcular el menor número e imprimir el valor.
        *  Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
        *
        */
        Scanner scanner = new Scanner(System.in);
        Integer valor = 0;
        Integer cantidadNumeros = 0;
        Integer menor = 999999999;
        Integer[] valores = new Integer[10];
        System.out.println("Ingrese la cantidad de números a comparar: ");
        cantidadNumeros = scanner.nextInt();

        if(cantidadNumeros < 10){
            System.out.println("Debe ingresar una cantidad mayor o igual a 10 para compararlos");
            return;
        }else{
            for(int i=0;i<10;i++){
                System.out.println("Ingrese el "+(i+1)+" Valor: ");
                valor = scanner.nextInt();
                valores[i] = valor;
            }
        }

        for(Integer val: valores){
            if(val < menor){
                menor = val;
            }
        }

        System.out.println("El número menor es: " + menor);

        if(menor < 10){
            System.out.println("El número menor es menor que 10!");
        }else{
            System.out.println("el numero menor es igual o mayor que 10!");
        }


    }
}
