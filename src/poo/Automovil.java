package poo;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;

    private int capacidadEstanque = 40;

    public Automovil() {

    }

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    /*Metodo no recomendable, ya que no recomienda las impresiones en las clases*/
    public void detalle(){
        System.out.println("automovil.fabricante = " + this.getFabricante());
        System.out.println("auto.modelo = "+this.getModelo());
        System.out.println("automovil.color = " + this.getColor());
        System.out.println("automovil.cilindrada = " + this.getCilindrada());
    }

    public String detalle2(){
        StringBuilder sb =new StringBuilder();
        sb.append("automovil.fabricante = " + this.getFabricante());
        sb.append("\nauto.modelo = "+this.getModelo());
        sb.append("\nautomovil.color = " + this.getColor());
        sb.append("\nautomovil.cilindrada = " + this.getCilindrada());
        return  sb.toString();
    }
    /*Metodo mejorado, nota como StrignBuilder es para manejar grandes cadenas que concatenar,
    podria usarse sin problemas una variable de tipo String*/

    public String verDetalle(){
        return  "automovil.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nautomovil.color = " + this.getColor() +
                "\nautomovil.cilindrada = " + this.getCilindrada();
    }

    public String acelerar(int rpm){
        return "El auto "+this.getFabricante()+" acelerando a "+rpm+"rpm";
    }

    public String frenar(){
         return  this.getFabricante() + " "+this.getModelo()+ " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return  acelerar + "\n"+frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.getCapacidadEstanque()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.getCapacidadEstanque()*(porcentajeBencina/100f));
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }
}
