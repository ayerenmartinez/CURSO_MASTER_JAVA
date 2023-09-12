public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10,11,12};
        for(int i=0;i<edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");
        for(int i=0;i<edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificado");
    }
    public static void test(int[] edad){
        System.out.println("Iniciamos el método test");
        for(int i=0;i<edad.length;i++){
            edad[i] += 20;
        }
        System.out.println("Finaliza el método test");
    }
}
