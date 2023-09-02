package tareas;

import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        /*Crear un sistema de reportes de notas de los alumnos
        Pedir 20 notas finales de alumnos en una escala de
        1 a 7, manejar decimales en las notas (double).
        Mostrar el promedio de las notas mayores a 5,
        promedio de notas inferiores a 4 y la cantidad de
        notas 1, ademas mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas)
        y dentro del ciclo pedir las notas una a una para
        realizar los cálculos (contadores, sumas).
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
         */
        Scanner teclado = new Scanner(System.in);
        Double nota = 0.0;
        Double sumaNotasMayors5 = 0.0;
        Double sumaNotasMenores4 = 0.0;
        Double sumaNotas = 0.0;
        Double promedioNotasMayores5 = 0.0;
        Double promedioNotasMenores4 = 0.0;
        Double promedioNotas = 0.0;
        Integer cantidadNotas1 = 0;
        Integer cantidadNotasMayores5 = 0;
        Integer cantidadNotasMenores4 = 0;
        Integer cantidadNotas = 0;
        for(int i = 0; i < 20 ;i++){
            System.out.println("Ingrese notas en una Escal de 1 a 7: ");
            nota = teclado.nextDouble();
            sumaNotas += nota;
            if(nota == 0){
                System.out.println("NOTA INVÁLIDA");
                break;
            }else{
                if(nota == 1){
                    cantidadNotas1++;
                }else if(nota < 4){
                    sumaNotasMenores4 += nota;
                    cantidadNotasMenores4++;
                }else if(nota > 5){
                    sumaNotasMayors5 += nota;
                    cantidadNotasMayores5++;
                }
            }
            cantidadNotas++;
        }
        promedioNotas = sumaNotas / cantidadNotas;
        promedioNotasMayores5 = sumaNotasMayors5 / cantidadNotasMayores5;
        promedioNotasMenores4 = sumaNotasMenores4 / cantidadNotasMenores4;
        System.out.println("El Promedio de las notas mayores de 5 es: " + promedioNotasMayores5);
        System.out.println("El Promedio de las notas menores de 4 es: " + promedioNotasMenores4);
        System.out.println("La Cantidad de notas iguales a 1 es: " + cantidadNotas1);
        System.out.println("El Promedio total de las notas es: " + promedioNotas);
    }
}
