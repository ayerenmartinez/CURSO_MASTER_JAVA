package poo_sobrecarga.org.ayeren.poosobrecarga;
import static poo_sobrecarga.org.ayeren.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int: "+Calculadora.sumar(10,5));
        System.out.println("sumar float: "+Calculadora.sumar(10.0f,5f));
        System.out.println("sumar float-int: "+Calculadora.sumar(10f,5));
        System.out.println("sumar int-float: "+Calculadora.sumar(10,5.0));
        System.out.println("sumar double: "+Calculadora.sumar(10d,5d));
        System.out.println("sumar double: "+Calculadora.sumar(10.0,5.0));
        System.out.println("sumar string: "+Calculadora.sumar("10","5"));
        System.out.println("sumar tres int: "+Calculadora.sumar(10,5,3));

        System.out.println("sumar long: "+sumar(10l,5l));
        System.out.println("sumar 4 int: "+sumar(10,5,3,4));
        System.out.println("sumar float + n: "+sumar(10.5f,5,9,15));
        System.out.println("sumar 3 double: "+sumar(10.0,5.0,3.5,4.5));
    }
}
