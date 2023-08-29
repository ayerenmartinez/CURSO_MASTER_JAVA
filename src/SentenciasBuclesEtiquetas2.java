public class SentenciasBuclesEtiquetas2 {
    public static void main(String[] args) {
        int [][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
        int numeroBuscado = 5;
        boolean encontrado = false;

        bucle1: for(int i=0;i<numeros.length;i++){
            System.out.println("ingreso al for1");
            for (int j=0;j<numeros.length;j++){
                if(numeros[i][j] == numeroBuscado){
                    encontrado = true;
                    break bucle1;
                }
                System.out.println("ingreso al for2");
            }
        }
        if(encontrado){
            System.out.println("Encontro el número: " + numeroBuscado);
        }else {
            System.out.println("No encontro el número: " + numeroBuscado);
        }

    }
}
