public class EjemploStringMetodosArrreglo {
    public static void main(String[] args) {


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        
        for(int i=0;i<largo;i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        for(int i=0;i<largo;i++){
            System.out.print("arreglo[i] = " + arreglo[i]);
        }

        for (char c : arreglo) {
            System.out.println("c = " + c);
        }
        System.out.println("");
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int i=0;i<l;i++){
            System.out.println("arreglo2[i] = " + arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); //usar asi \\. o entre corchetes[.] sino el array será de 0 elementos
        for (int i=0;i<archivoArr.length;i++){
            System.out.println("archivoArr[i] = " + archivoArr[i]);
        }
        System.out.println("archivoArr[archivoArr.length-1] = " + archivoArr[archivoArr.length-1]);

    }
}
