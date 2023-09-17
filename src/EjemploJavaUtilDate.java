import java.text.SimpleDateFormat;
import java.util.Date;
public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha  = new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr =  df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr1 =  df1.format(fecha);
        System.out.println("fechaStr1 = " + fechaStr1);
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr2 =  df2.format(fecha);
        System.out.println("fechaStr2 = " + fechaStr2);
        SimpleDateFormat df3 = new SimpleDateFormat("dd/MMM/yyyy");
        String fechaStr3 =  df3.format(fecha);
        System.out.println("fechaStr3 = " + fechaStr3);
        SimpleDateFormat df4 = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        String fechaStr4 =  df4.format(fecha);
        System.out.println("fechaStr4 = " + fechaStr4);
        SimpleDateFormat df5 = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr5 =  df5.format(fecha);
        System.out.println("fechaStr5 = " + fechaStr5);
        SimpleDateFormat df6 = new SimpleDateFormat("EE dd 'de' MMMM, yyyy");
        String fechaStr6 =  df6.format(fecha);
        System.out.println("fechaStr6 = " + fechaStr6);

        long j = 0;
        for(int i = 0;i < 10000000; i++){
            j += i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal =fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurridon en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
