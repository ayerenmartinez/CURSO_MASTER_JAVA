import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i < a.length;i++){
            System.out.println("Ingrese un Nombre: ");
            a[i] = scanner.next();
        }
        System.out.println("\r\nIngrese un Nombre a buscar: ");
        String nombre = scanner.next();
        int i = 0;
        for(;i<a.length && !a[i].equalsIgnoreCase(nombre);i++){}

        if(i == a.length){
            System.out.println("Nombre no encontrado");
        }else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("Encontrado en la posición: "+i);
        }
    }
}
