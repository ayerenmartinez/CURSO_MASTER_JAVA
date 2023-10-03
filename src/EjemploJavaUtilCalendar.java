import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        /*
        calendario.set(2020,0,25,19,20,10);
        calendario.set(2020,Calendar.SEPTEMBER,25,19,20,10);
         */
        calendario.set(Calendar.YEAR,2023);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,25);
        //calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM,Calendar.PM);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);
        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);
        //con HH en mayuscula es formato de hora de 24 horas y en minusculas de 12 horas
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //dd con miniscula es dia del mes y DD con mayuscula es dia pero del Año, tener en cuenta ese detalle
        String fechaConFormato  = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);
    }
}
