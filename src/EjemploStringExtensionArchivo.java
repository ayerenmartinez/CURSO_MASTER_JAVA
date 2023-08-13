public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.xlsx";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("extensión = " + archivo.substring(i+1));
        System.out.println("archivo.indexOf(\".\") = " + archivo.indexOf("."));
    }
}
