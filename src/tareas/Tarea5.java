package tareas;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        /*
        Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
        se requiere un programa que pida la medida actual en litros
        y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente
        */
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Double capacidadActualLitros = 0.0;
        System.out.println("Ingrese la Medidad Actual del Estanque en Litros: ");
        capacidadActualLitros = scanner.nextDouble();
        if(capacidadActualLitros == 70){
            System.out.println("Estanque lleno");
        }else if(capacidadActualLitros >= 60 && capacidadActualLitros < 70){
            System.out.println("Estanque casi lleno");
        }else if(capacidadActualLitros >= 40 && capacidadActualLitros < 60){
            System.out.println("Estanque 3/4");
        }else if(capacidadActualLitros >= 35 && capacidadActualLitros < 40){
            System.out.println("Medio estanque");
        }else if(capacidadActualLitros >= 20 && capacidadActualLitros < 35){
            System.out.println("Suficiente");
        }else if(capacidadActualLitros >= 1 && capacidadActualLitros < 20){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Dato incorrecto");
        }


    }
}
