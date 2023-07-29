public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de "+numeroDecimal+ " = "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //anteponiendo 0b antes del numero JAVA entiende que es un numero binario
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de = " + numeroDecimal + " = "+Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764; //anteponiendo el 0 JAVA interpreta que es un numero Octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4; //anteponiendo 0x JAVA interpreta que es un numero Hexadecimal
        System.out.println("numeroHex = " + numeroHex);

    }
}
