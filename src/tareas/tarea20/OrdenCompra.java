/*
* La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.

En la clase OrdenCompra, crear constructor que inicialice solo la descripción.

En la clase OrdenCompra, crear métodos getter para todos los atributos.

En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.

Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.

Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.

Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.

Preguntas de esta tarea
Publica acá el código fuente completo de la tarea, adicional y opcionalmente puedes adjuntar tu proyecto.*/

package tareas.tarea20;

import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;
    private int indiceProductos;
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }
}
