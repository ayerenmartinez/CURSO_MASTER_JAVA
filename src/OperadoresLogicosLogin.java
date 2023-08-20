import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "anthony";
        String password = "123456";
        String username2 = "admin";
        String password2 = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username: ");
        String user = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        if((username.equals(user) && password.equals(pass)) || (username2.equals(user) && password2.equals(pass)) ){
            esAutenticado = true;
        }else{
            System.out.println("Username o password incorrecto!");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(user).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
