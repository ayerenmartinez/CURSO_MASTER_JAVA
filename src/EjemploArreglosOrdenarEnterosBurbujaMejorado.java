public class EjemploArreglosOrdenarEnterosBurbujaMejorado {

    public static void sortBurbujaAscendente(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for(int i=0;i<total - 1;i++){
            for(int j=0;j< total -1 - i;j++){
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j])<0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void sortBurbujaDescendente(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for(int i=0;i<total - 1;i++){
            for(int j=0;j< total -1 - i;j++){
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j])>0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {
        //FORMAS PARA ORDENAR COMO compareTo
        //1.- Convertir el array a un tipo Wrapper Integer[] numeros = new int[4]
        //2.- Casterar numeros[j+1].compareTo(numeros[j])<0
        //3.- Utilizar Comparable y haciendolo más genérico

        Integer[] numeros  = new Integer[4];

        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbujaDescendente(numeros);

        for(int i=0;i<numeros.length;i++){
            System.out.println("i  = " + i + " : "+numeros[i]);
        }
    }
}
