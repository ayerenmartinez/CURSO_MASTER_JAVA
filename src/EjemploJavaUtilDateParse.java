import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            //Date fecha = format.parse("2020-01-05");
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            //dos maneras de obtener la fecha actual
            //Date fecha2 = new Date(); //forma1
            Calendar fechita = Calendar.getInstance(); //forma2
            System.out.println("fechita.getTime() = " + fechita.getTime());
            if(fecha.after(fechita.getTime())){
                System.out.println("fecha del usuario es después que fecha 2");
            }else if(fecha.before(fechita.getTime())){
                System.out.println("fecha del usuario es antes que fecha 2");
            }else if(fecha.equals(fechita.getTime())){
                System.out.println("fecha del usuario es igual a fecha2");
            }
            //Comparación usando el método compareTo de la interfaz Comparable
            if(fecha.compareTo(fechita.getTime()) > 0){
                System.out.println("fecha del usuario es después que fecha 2");
            }else if(fecha.compareTo(fechita.getTime()) < 0){
                System.out.println("fecha del usuario es antes que fecha 2");
            }else if(fecha.compareTo(fechita.getTime()) == 0){
                System.out.println("fecha del usuario es igual a fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
