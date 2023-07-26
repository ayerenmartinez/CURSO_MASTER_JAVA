public class PrimitivosFloat {
    static float varFlotante2; //variable de clase
    public static void main(String[] args) {
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);

        float realFloat1 = 2.12e3f; //2120f
        System.out.println("realFloat = " + realFloat1);

        float realFloat2 = 1.5e4f; //15000f
        System.out.println("realFloat = " + realFloat2);

        float realFloat3 = 0.00000000015f; //1.5e-10f
        System.out.println("realFloat = " + realFloat3);

        System.out.println("float corresponde en byte = " + Float.BYTES);
        System.out.println("float corresponde en bites a = "+ Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);
        System.out.println("máximo exponente para float = " + Float.MAX_EXPONENT);
        System.out.println("mínimo exponente para float = " + Float.MIN_EXPONENT);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte = " + Double.BYTES);
        System.out.println("double corresponde en bites a = "+ Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);
        System.out.println("máximo exponente para double = " + Double.MAX_EXPONENT);
        System.out.println("mínimo exponente para double = " + Double.MIN_EXPONENT);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);


        System.out.println("varFlotante2 = " + varFlotante2);
    }
}
