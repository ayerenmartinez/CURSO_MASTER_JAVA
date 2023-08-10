public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Anthony";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase()" + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase()" + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Anthony\") = " + nombre.equals("Anthony"));
        System.out.println("nombre.equals(\"anthony\") = " + nombre.equals("anthony"));
        System.out.println("nombre.equals(\"anthony\") = " + nombre.equalsIgnoreCase("anthony"));
        System.out.println("nombre.equals(\"Anthony\") = " + nombre.compareTo("Anthony"));
        System.out.println("nombre.equals(\"Anthony\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = "+nombre.charAt(0));
        System.out.println("nombre.charAt(0) = "+nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
    }
}
