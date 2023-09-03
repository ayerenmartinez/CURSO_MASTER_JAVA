package tareas;

import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {
        /*
        * Multiplicar dos números sin usar el símbolo de multiplicación.
        * Mediante el teclado pedir dos números enteros positivos o negativos
        * y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

        Puede utilizar una sentencia for para realizar la multiplicación y tener
        en cuenta los unarios, donde menos por menos es positivo.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int producto = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA ? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            producto = producto + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            producto = -producto;
        }

        System.out.println("el producto es " + producto);
    }
}
