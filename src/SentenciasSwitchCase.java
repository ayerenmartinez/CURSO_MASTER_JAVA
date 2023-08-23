import java.util.Scanner;

public class SentenciasSwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 1 :{
                System.out.println("El número es uno");
                break;
            }
            case 2:{
                System.out.println("El número es dos");
                break;
            }
            case 3:{
                System.out.println("El número es tres");
                break;
            }

        }
        String nombre ="andres";
        switch (nombre){
            case "admin":{
                System.out.println("Hola admin, bienvenido!");
                break;
            }
            case "andres":{
                System.out.println("Hola andres!");
                break;
            }
            case "pepe":{
                System.out.println("Hola pepe");
                break;
            }
            default:{
                System.out.println("usuario desconocido");
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 - 12");
        int mes = sc.nextInt();
        String nombreMes = null;
        switch (mes){
            case 1:{
                nombreMes = "Enero";
                break;
            }
            case 2:{
                nombreMes = "Febrero";
                break;
            }
            case 3:{
                nombreMes = "Marzo";
                break;
            }
            case 4:{
                nombreMes = "Abril";
                break;
            }
            case 5:{
                nombreMes = "Mayo";
                break;
            }
            case 6:{
                nombreMes = "Junio";
                break;
            }
            case 7:{
                nombreMes = "Julio";
                break;
            }
            case 8:{
                nombreMes = "Agosto";
                break;
            }
            case 9:{
                nombreMes = "Septiembre";
                break;
            }
            case 10:{
                nombreMes = "Octubre";
                break;
            }
            case 11:{
                nombreMes = "Noviembre";
                break;
            }
            case 12:{
                nombreMes = "Diciembre";
                break;
            }
            default:{
                nombreMes = "Indefinido";
                break;
            }
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
