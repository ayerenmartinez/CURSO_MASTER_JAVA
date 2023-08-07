public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        boolean esIgual2 = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual2);
        boolean esIgual3 = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual3 = " + esIgual3);
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3  =" + curso3);
    }
}
