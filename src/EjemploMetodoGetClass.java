import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto  = "Hola que tal!";
        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for(Method method : strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
        System.out.println("cantidad de métodos  = " + strClass.getMethods().length) ;
        
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getName() = " + intClass.getSimpleName());
        System.out.println("intClass.getName() = " + intClass.getPackageName());
        System.out.println("intClass.getName() = " + intClass);

        for(Method method : intClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
        System.out.println("cantidad de métodos  = " + intClass.getMethods().length) ;
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //Superclass de Integer es Number
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass()); //Superclass de Number es Object

    }
}
