public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        System.out.println(curso != null ? curso.toUpperCase() : curso);
        if(!esNulo){
            System.out.println(curso.toUpperCase());
        }
        //System.out.println("Bienvenido al curso ".concat(curso));

        if(esNulo){
            curso = "Programación Java";
        }
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso ".concat(curso.toUpperCase()));

        if(esNulo){
            curso = "";
        }
        boolean esVacio = curso.length() == 0;
        if(!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso.toUpperCase()));
        }
        boolean esVacio2 = curso.isEmpty();
        if(!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso.toUpperCase()));
        }
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso.toUpperCase()));
        }
    }
}
