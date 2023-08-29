public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        buscarUnaPalabraEnLaFrase();
    }

    public static void buscarUnaPalabraEnLaFrase(){
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;

        buscar: for(int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0;j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase");
    }

    public static void buscarUnCaracter(){
        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cont = 0;
        char letra = 'g';
        for(int i = 0; i < max; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cont++;
        }
        System.out.println("Encontrado = " + cont + " veces el caracter '"+letra+"' en la frase");
    }
}
