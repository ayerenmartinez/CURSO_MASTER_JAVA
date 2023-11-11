import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("textedit");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("nux") ||
                    System.getProperty("os.name").toLowerCase().startsWith("nix")){
                proceso = rt.exec("gedit");
            }
            else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
