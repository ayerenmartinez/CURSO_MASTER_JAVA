public class prueba {
    /*EJERCICIO PARA PRÁCTICAR*/
    public static void main(String[] args) {
        int var1 = 110;
        int var2 = 210;
        System.out.println(numbersLastDigitsEqual(var1,var2));
    }
    public static boolean numbersLastDigitsEqual(int var1,int var2){
        int lastDigitsVar1 = var1 % 100;
        System.out.println(lastDigitsVar1);
        int lastDigitsVar2 = var2 % 100;
        System.out.println(lastDigitsVar2);
        return  lastDigitsVar1 == lastDigitsVar2;
    }
}
