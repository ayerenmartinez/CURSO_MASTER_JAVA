import java.util.Scanner;

public class OperadoresLogicosLoginArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*PRIMERA FORMA PARA DECLARAR UN ARRAY EN JAVA*/
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "anthony";
        passwords[1] = "123456";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[3] = "pepe";
        passwords[3] = "12345";

        /*SEGUNDA FORMA PARA DECLARAR UN ARRAY EN JAVA*/
        String[] usernames1 = {"andres","admin","pepe"};
        String[] passwords1 = {"123456","12345","12345"};




        System.out.println("Ingrese el username: ");
        String user = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i=0; i<usernames.length;i++){
            if(usernames[i].equals(user) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(user).concat("!"));
        }else{
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
