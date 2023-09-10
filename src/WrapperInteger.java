public class WrapperInteger {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(32768); //autoboxing forma explicita
        System.out.println("intObjeto = " + intObjeto);
        Integer intObjeto2 = 32768; //autoboxing - forma implicita
        int intPrimitivo = 32768;
        //el metodo valueOf convierte un primitivo a un objeto

        //convertir de tipo objeto a primitivo / unboxing
        int num = intObjeto; //forma implicita
        int num2 = intObjeto2.intValue(); //forma explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = 32767;
        Short shortObjeto2 = intObjeto2.shortValue(); // de entero a Short aqui puede haber perdida de informacion o mostrar resultados erroneos o ambiguos

        Byte byteObjeto = intObjeto.byteValue(); //aqui tambien habria perdida de informacion al menos que caba el valor de la variable de referencia
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue(); //aqui si no habria perdida de informacion ya que long tiene mas capacidad que un Integer
        System.out.println("longObjeto = " + longObjeto);
    }
}
