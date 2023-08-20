public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String ... que tal!";
        Integer num = 7;
        Number  num1 = 10;
        Number  num2 = Integer.valueOf(7); //esta es una forma válida de declarar un entero
        //Number  num3 = new Integer(10); //esta es una forma deprecada o no válida para declarar un entero
        Boolean b1 = texto instanceof  String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof  Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof  Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num1 instanceof Integer;
        System.out.println("num1 es del tipo Integer = " + b1);

        b1 = num1 instanceof Number;
        System.out.println("num1 es del tipo Number = " + b1);

        b1 = num1 instanceof Object;
        System.out.println("num1 es del tipo Number = " + b1);

        b1 = num1 instanceof Long;
        System.out.println("num1 es del tipo Long = " + b1);

        b1 = num1 instanceof Double;
        System.out.println("num1 es del tipo Double = " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = "+ b1);

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = "+ b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = "+ b1);
    }
}
