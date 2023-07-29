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
        char retornoCarro = '\r'; // es parecido al \n, en windows el resultado de \n y \r es similar, esto funciona en algunas
        //distribuciones de linux  y en versiones antiguas de Mac, en windows se usan juntos así "\n\r"

        System.out.println("char corresponde en byte:" + espacio+ Character.BYTES); //Un string tambien puede concatenar una variable de tipo char
        System.out.println("char corresponde en byte:" + retroceso+ Character.BYTES);// lo que hace es retroceder y eliminar el caracter anterior, en este caso desaprecen los  dos puntos ":"
        System.out.println("char corresponde en byte:" + tabulador+ Character.BYTES);//deja un espacio como de sangria llamado espacio "tabulador"
        System.out.println("char corresponde en \tbyte:" + tabulador+ Character.BYTES);
        System.out.println("char corresponde en byte:" + nuevaLinea+ Character.BYTES);//esto genera un salto de linea con el caracter especial \n
        System.out.println("char corresponde en byte:" + retornoCarro+ Character.BYTES);
        System.out.println("char corresponde en byte:" + System.getProperty("line.separator")+ Character.BYTES);//funciona parecido a usar \n y \r
        System.out.println("char corresponde en byte:" + System.lineSeparator()+ Character.BYTES);//otra forma a la anterior

        System.out.println("hola soy Anthony: "+ System.lineSeparator()+  Character.BYTES);
    }

}
