public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String realStr1 = "98765.43e-3";
        double realDouble1 = Double.parseDouble(realStr1);
        System.out.println("realDouble1 = " + realDouble1);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        String otroNumeroStr1 = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr1 = " + otroNumeroStr1);

        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        double otroRealDouble1 = 1.23456e2;
        String otroRealStr1 = Double.toString(otroRealDouble1);
        System.out.println("otroRealStr = " + otroRealStr1);

        otroRealStr1 =String.valueOf(1.23456e2f);
        System.out.println("otroRealStr1 = " + otroRealStr1);

        int i = 10000;
        short s = (short) i; // aqui puede ocurrir perdida de datos por lo que estamos obligados a hacer la conversion
        System.out.println("s = " + s);
        long l = i; //aqui el long puede capturar el valor de i ya que es un tipo de dato mas grande
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
    }
}
