public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {
                "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta generación",
                "Bicicleta Oxford"};
        int total = productos.length;
        int contador = 0;
        for(int i=0; i<total; i++){
            for(int j=0; j<total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        System.out.println("=== Usando for ===");
        for(int i=0; i<= total-1; i++){ //si es menor hasta (total), si es menor o igual (total-1)
            System.out.println("para indice "+ i + " : "+productos[i]);
        }
    }
}
