package poo;

import java.util.Objects;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS; //EL COLOR POR DEFECTO SERÍA COLOR_GRIS
    private double cilindrada;

    private int capacidadEstanque = 40;

    private static Color colorPatente = Color.NARANJO;

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;

    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public static final Color COLOR_ROJO = Color.ROJO;

    public static final Color COLOR_AMARILLO = Color.AMARILLO;

    public static final Color COLOR_AZUL = Color.AZUL;

    public static final String COLOR_BLANCO = "Blanco";

    private static final String COLOR_GRIS = "Gris Oscuro";

    private TipoAutomovil tipo;

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    private static int capacidadEstanqueEstatico = 30;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante,modelo,color,cilindrada);
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
        return  "auto.id = " + this.id+
                "\nautomovil.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = "+this.getTipo().getNombre() +
                "\nautomovil.color = " + this.color.getColor() +
                "\nautomovil.cilindrada = " + this.getCilindrada() +
                "\nautomovil.patenteColor = " + Automovil.colorPatente.getColor();
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }
    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if (!(obj instanceof Automovil)){
            return  false;
        }
        Automovil a = (Automovil) obj;
        return this.fabricante != null && this.modelo != null
               && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "id='"+id+'\''+
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
