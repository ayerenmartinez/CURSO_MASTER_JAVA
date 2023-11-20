import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;


        productos[0] ="Kingston Pendrive 64gb";
        productos[1] ="Samsung Galaxy";
        productos[2] ="Disco Durso SSD Samsung Externo";
        productos[3] ="Asus Notebook";
        productos[4] ="Macbook Air";
        productos[5] ="Chromecast 4ta generación";
        productos[6] ="Bicleta Oxford";

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for(int i=0; i<= total-1; i++){ //si es menor hasta (total), si es menor o igual (total-1)
            System.out.println("para indice "+ i + " : "+productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while(i < total){
            System.out.println("para indice "+ i + " : "+productos[i]);
            i++;
        }
        System.out.println("=== Usando Do while ===");
        int j = 0;
        do {
            System.out.println("para indice "+ j + " : "+productos[j]);
            j++;
        }while (j<total);

        //Llenando arreglos
        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k=0; k<totalNumeros;k++){
            numeros[k] = k*3;
        }
        for(int k=0; k<totalNumeros;k++){
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
