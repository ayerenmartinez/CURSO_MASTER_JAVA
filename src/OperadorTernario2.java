import java.util.Scanner;

public class OperadorTernario2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = {"anthony","admin","pepe"};

        String[] passwords = {"123456","12345","12345"};

        System.out.println("Ingrese el username: ");
        String user = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i=0; i<usernames.length;i++){
            esAutenticado = usernames[i].equals(user)  && passwords[i].equals(pass) ? true : false;
            if(esAutenticado){
                break;
            }
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(user).concat("!") :
                "Username o contraseña incorrecto! \n Lo siento, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
    }
}
