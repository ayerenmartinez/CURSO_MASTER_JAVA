
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entero");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception ex){
            System.out.println("Error debe ingresar un número entero");
//            System.out.println(ex.getMessage());
            main(args);
            System.exit(0); //tambien puedo usar return
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String mensajeBinario = "numero binario de "+numeroDecimal+ " = "+Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de  " + numeroDecimal + " = "+Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal =  "numero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario+"\n";
        mensaje += mensajeOctal+"\n";
        mensaje += mensajeHexadecimal;
        System.out.println(mensaje);
    }
}
