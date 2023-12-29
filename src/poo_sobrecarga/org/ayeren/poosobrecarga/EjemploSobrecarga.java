package poo_sobrecarga.org.ayeren.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("sumar int: "+calculadora.sumar(10,5));
        System.out.println("sumar float: "+calculadora.sumar(10.0f,5f));
        System.out.println("sumar float-int: "+calculadora.sumar(10f,5));
        System.out.println("sumar int-float: "+calculadora.sumar(10,5.0));
        System.out.println("sumar double: "+calculadora.sumar(10d,5d));
        System.out.println("sumar double: "+calculadora.sumar(10.0,5.0));
        System.out.println("sumar string: "+calculadora.sumar("10","5"));
        System.out.println("sumar tres int: "+calculadora.sumar(10,5,3));

        System.out.println("sumar long: "+calculadora.sumar(10l,5l));
        System.out.println("sumar 4 int: "+calculadora.sumar(10,5,3,4));
        System.out.println("sumar float + n: "+calculadora.sumar(10.5f,5,9,15));
        System.out.println("sumar 3 double: "+calculadora.sumar(10.0,5.0,3.5,4.5));
    }
}
