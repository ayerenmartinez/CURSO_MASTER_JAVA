public class ArgumentosLineaComando {
    public static void main(String[] args) {
        //javac para compilar y generar el archivo bytecode con extensión .class
        //java para ejecutar el bytecode
        //-encode utf8 (puede ir al costado de javac o al final) para compilar y corregir el error de las tildes y caracteres especiales
        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1); //cuando sale un error -1
        }
        for(int i=0;i<args.length;i++){
            System.out.println("Argumentos n° = " + i + ": "+args[i]);
        }
    }
}
