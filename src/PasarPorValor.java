public class PasarPorValor {
    //Integer, String, Boolean, Double son objetos inmutables o cualquier objeto de tipo Number
    public static void main(String[] args) {
        int i = 10;
        Integer i2 = 10;
        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);
        test2(i2);
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i2);
    }
    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
    public static void test2(Integer i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }
}
