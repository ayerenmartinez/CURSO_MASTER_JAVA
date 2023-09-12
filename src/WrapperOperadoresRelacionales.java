public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        /*JAVA HASA EL VALOR 127 COMPARA AUTOMATICAMENTE CON LOS VALORES PRIMITIVOS*/
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("¿Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);
    }
}
