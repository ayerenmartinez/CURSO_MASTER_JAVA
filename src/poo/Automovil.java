package poo;

public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    /*Metodo no recomendable, ya que no recomienda las impresiones en las clases*/
    public void detalle(){
        System.out.println("automovil.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = "+this.modelo);
        System.out.println("automovil.color = " + this.color);
        System.out.println("automovil.cilindrada = " + this.cilindrada);
    }

    public String detalle2(){
        StringBuilder sb =new StringBuilder();
        sb.append("automovil.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = "+this.modelo);
        sb.append("\nautomovil.color = " + this.color);
        sb.append("\nautomovil.cilindrada = " + this.cilindrada);
        return  sb.toString();
    }
}
