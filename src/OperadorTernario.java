import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable =  7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematica = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matemática en escala de 2.0 - 7.0: ");
        matematica = scanner.nextDouble();
        System.out.println("Ingrese la nota de Ciencias en escala de 2.0 - 7.0: ");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de Historia en escala de 2.0 - 7.0: ");
        historia = scanner.nextDouble();

        promedio = (matematica + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "APROBADO" : "RECHAZADO";
        System.out.println("estado = " + estado);

        if(promedio >= 5.49){
            estado = "APROBADO";
        }else{
            estado = "RECHAZADO";
        }

    }
}
