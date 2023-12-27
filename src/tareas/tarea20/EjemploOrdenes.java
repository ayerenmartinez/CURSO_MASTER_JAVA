package tareas.tarea20;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setCliente(new Cliente("Andres", "Guzman"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital",  54890,"Unidad SSD 480GB"));
        orden1.addProducto(new Producto("MSI",  363940,"Monitor Optix G271"));
        orden1.addProducto(new Producto("AMD",  599990,"Procesador AMD Ryzen 9 5900X"));
        orden1.addProducto(new Producto("EVGA", 1849990,"Tarjeta de video EVGA RTX 3080Ti"));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("John", "Doe"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Fensa", 239990,"Cocina"));
        orden2.addProducto(new Producto("Samsung", 429990,"Refrigerador"));
        orden2.addProducto(new Producto("Midea",  149990,"Lavadora"));
        orden2.addProducto(new Producto("Aspiradora",  199990,"IRobot"));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Pepa", "Roe"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Melon",  4870,"Cemento 25kg"));
        orden3.addProducto(new Producto("Grau", 6040,"Hormigon"));
        orden3.addProducto(new Producto("Ceramicas Santiago",  790,"Ladrillo"));
        orden3.addProducto(new Producto("Redline", 48990,"Escala articulada aluminio"));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
