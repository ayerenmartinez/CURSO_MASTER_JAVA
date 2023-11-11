import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo","rojo","verde","blanco","negro"};
        double coloresRandom = Math.random();
        coloresRandom *= colores.length;
        System.out.println("coloresRandom = " + coloresRandom);
        coloresRandom = Math.floor(coloresRandom);
        System.out.println("coloresRandom = " + coloresRandom);
        //se redondea hacia abajo, ya que las
        //posiciones del arreglo "colores" van del 0 al 5, y si se usara Math.ceil (hacia arriba)
        //tendrias una excepción de desbordamiento
        System.out.println("colores = "+ colores[(int)coloresRandom]);






        double random = Math.random(); //devuelve un numero aleatorio entre 0 y 1 (sin considerar el 1)
        System.out.println("random = " + random);
        
        //devolver un numero entre 0 y 7 (sin considerar el 7)
        random *= 7;
        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("random = " + random);


        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        //aleatorio entre 15 y 25 (sin incluir el 25)
        int randomInt2 = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt2 = " + randomInt2);
        
        //aleatorio entre 0 y 7 (sin incluir el 7)
        int randomInt3 = randomObj.nextInt(7);
        System.out.println("randomInt3 = " + randomInt3);

        //aleatorio entre 15 y 25 (incluyendo el 25)
        int randomInt4 = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt2 = " + randomInt2);

        int randomInt5 = randomObj.nextInt(colores.length);
        System.out.println("randomInt5 = " + randomInt5);
        System.out.println("colores = "+colores[randomInt5]);
    }
}
