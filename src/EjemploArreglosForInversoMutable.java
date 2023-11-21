import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {
        String[] productos = {
                "Kingston Pendrive 64gb",
                "Samsung Galaxy",
                "Disco Durso SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta generación",
                "Bicleta Oxford"};
        int total = productos.length;
        Arrays.sort(productos);
        arregloInverso(productos);

        //Ordenamiento con la Clase Collections - Método reverse (para ordenar descendentemente)
        Collections.reverse(Arrays.asList(productos));//convertimos el arreglo a una lista con la Clase Arrays, y el método asList

        System.out.println("=== Usando for ===");
        for(int i=0; i<= total-1; i++){ //si es menor hasta (total), si es menor o igual (total-1)
            System.out.println("para indice "+ i + " : "+productos[i]);
        }
        /*
        for(int i=0;i<total/2;i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }
        */
    }
    public static void arregloInverso(String[] arreglo){
        //esta es parecida a la anterior solo que decrementa el valor de total2, pero
        //al final es lo mismo
        int total  = arreglo.length;
        int total2 = arreglo.length;
        for(int i=0;i<total2;i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
}
