public class PrimitivoCaracteres {

    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 40;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("el máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("el mínimo valor para char = " + Character.MIN_VALUE);

        char espacio = ' ';
        System.out.println("espacio = " + espacio);
        char espacio2 = '\u0020';
        System.out.println("espacio2 = " + espacio2);
        char retroceso = '\b';
        System.out.println("retroceso = " + retroceso);
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
    }

}
