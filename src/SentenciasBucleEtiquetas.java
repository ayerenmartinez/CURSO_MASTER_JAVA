public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for(int i=0;i<5;i++){
            System.out.print("[ prueba salto bucle ]");
            System.out.println();
            for(int j=0;j<5;j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = "+ j +"], ");
            }
        }
        System.out.println();
        System.out.println("\n=========================================================================================");
        System.out.println();
        bucle2:
        for(int i=0;i<5;i++){
            System.out.print("[ prueba salto bucle ]");
            System.out.println();
            for(int j=0;j<5;j++){
                if(i == 2){
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = "+ j +"], ");
            }
        }

        System.out.println();
        System.out.println("\n=========================================================================================");
        System.out.println();

        bucle3:
        for(int i = 1; i <= 7; i++){
            int j = 1;
            while (j <= 8){
                if(i == 6 || i == 7){
                    System.out.println("Dia " + ": descanso de fin de semana!");
                    continue bucle3;
                }
                System.out.println("[Dia = "+ i + ", trabajandoa las = "+ j +"hrs. ");
                j++;
            }
        }

    }
}
