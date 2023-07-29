import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            System.out.println(ex.getMessage());
            main(args);
            System.exit(0); //tambien puedo usar return
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String mensajeBinario = "numero binario de "+numeroDecimal+ " = "+Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100; //anteponiendo 0b antes del numero JAVA entiende que es un numero binario
        System.out.println("numeroBinario = " + numeroBinario);
        String mensajeOctal = "numero octal de  " + numeroDecimal + " = "+Integer.toOctalString(numeroBinario);

        int numeroOctal = 0764; //anteponiendo el 0 JAVA interpreta que es un numero Octal
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal =  "numero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4; //anteponiendo 0x JAVA interpreta que es un numero Hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario+"\n";
        mensaje += mensajeOctal+"\n";
        mensaje += mensajeHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
