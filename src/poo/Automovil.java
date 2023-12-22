package poo;

import java.util.Objects;

public class Automovil implements Comparable{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS; //EL COLOR POR DEFECTO SERÍA COLOR_GRIS
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private TipoAutomovil tipo;
    private static Color colorPatente = Color.NARANJO;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;

    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public static final Color COLOR_ROJO = Color.ROJO;

    public static final Color COLOR_AMARILLO = Color.AMARILLO;

    public static final Color COLOR_AZUL = Color.AZUL;

    public static final String COLOR_BLANCO = "Blanco";

    private static final String COLOR_GRIS = "Gris Oscuro";

    private int indiceRuedas;


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
        this.ruedas = new Rueda[5];
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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    /*Metodo no recomendable, ya que no recomienda las impresiones en las clases*/
    public void detalle(){
        System.out.println("automovil.fabricante = " + this.getFabricante());
        System.out.println("auto.modelo = "+this.getModelo());
        System.out.println("automovil.color = " + this.getColor());
        System.out.println("automovil.cilindrada = " + this.motor.getCilindrada());
    }

    public String detalle2(){
        StringBuilder sb =new StringBuilder();
        sb.append("automovil.fabricante = " + this.getFabricante());
        sb.append("\nauto.modelo = "+this.getModelo());
        sb.append("\nautomovil.color = " + this.getColor());
        sb.append("\nautomovil.cilindrada = " + this.motor.getCilindrada());
        return  sb.toString();
    }
    /*Metodo mejorado, nota como StrignBuilder es para manejar grandes cadenas que concatenar,
    podria usarse sin problemas una variable de tipo String*/

    public String verDetalle(){
        String detalle =  "auto.id = " + this.id+
                "\nautomovil.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();

                if(this.getTipo() != null){
                  detalle +=  "\nauto.tipo = "+ this.getTipo().getNombre();
                }

                detalle += "\nautomovil.color = " + this.color.getColor();
                if(this.getMotor() != null){
                  detalle += "\nautomovil.cilindrada = " + this.motor.getCilindrada();
                }

                detalle += "\nautomovil.patenteColor = " + Automovil.colorPatente.getColor();

                detalle += "\nConductor subaru: "+this.getConductor();

                if(getRuedas() != null){
                    detalle += "Ruedas del automóvil: ";
                    for (Rueda r: this.getRuedas()) {
                        detalle += "\n"+r.getFabricante()+", aro: "+r.getAro()+", ancho: "+r.getAncho();
                    }
                }

                if(conductor != null){
                    detalle += "\nConductor subaru: "+this.getConductor();
                }

        return  detalle;
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
        return km/(this.estanque.getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.estanque.getCapacidad()*(porcentajeBencina/100f));
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
                ", color='" + (this.color != null ? this.color : " ") + '\'' +
                ", cilindrada=" + (this.motor != null ? this.motor.getCilindrada() : " ")+
                ", capacidadEstanque=" + (this.estanque != null ? this.estanque.getCapacidad() :"") +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    @Override
    public int compareTo(Object o) {
        Automovil a = (Automovil) o;
        return this.fabricante.compareTo(a.fabricante);
    }

    /* Usando genericos, deberia colocar Automovil implements Comparable<Automovil>
    y ya no seria necesario hacer el casting en el métodom comparteTo
    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }

     */
}
