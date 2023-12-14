import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        for(int i=0;i<a.length;i++){
            System.out.println("Ingrese un valor: ");
            a[i] = scanner.nextInt();
        }
        //Desplazamiento
        int ultimoValor = a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0] = ultimoValor;
        //Mostrar nuevo Array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
