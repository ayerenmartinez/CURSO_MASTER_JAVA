public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

        /*
        ++a Pre-incremento "Incrementa en uno,y luego devuelve el valor de a.
        a++ Post-incremento "Devuelve el valor de a, y luego incrementa en uno.
        --a Pre-decremento "Decrementa en uno, y luego devuelve el valor de a.
        a-- Post-decremento "Devuelve el valor de a, y luego decrementa en uno.
         */
    }
}
