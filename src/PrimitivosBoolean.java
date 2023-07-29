public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogico2 = Boolean.FALSE; //este seria una objecto o Constante, y es una instancia de la Clase o Wrapper Boolean
        System.out.println("datoLogico2 = " + datoLogico2);
        
        boolean datoLogico3 = Boolean.FALSE.booleanValue(); //obtengo el valor del primitivo
        System.out.println("datoLogico3 = " + datoLogico3);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345e2f; //123.45
        System.out.println("f = " + f);
        
        datoLogico = d > f;
        System.out.println("datoLogico = = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
