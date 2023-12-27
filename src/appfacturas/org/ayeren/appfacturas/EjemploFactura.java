package appfacturas.org.ayeren.appfacturas;

import appfacturas.org.ayeren.appfacturas.modelo.Cliente;
import appfacturas.org.ayeren.appfacturas.modelo.DetalleFactura;
import appfacturas.org.ayeren.appfacturas.modelo.Factura;
import appfacturas.org.ayeren.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        String descripcion = scanner.nextLine();
        Factura factura = new Factura(descripcion,cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° "+producto.getCodigo() + ": ");
            producto.setNombre(scanner.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            DetalleFactura item = new DetalleFactura(scanner.nextInt(),producto);
            factura.addDetalleFactura(item);

            System.out.println();
        }

        System.out.println(factura.generarDetalle());
    }
}
