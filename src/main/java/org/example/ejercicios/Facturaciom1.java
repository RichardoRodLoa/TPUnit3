package org.example.ejercicios;

import java.util.List;

public class Facturaciom1 {
    // Definición del registro "factura" para almacenar información de las facturas.
    record factura(String cliente, String fechaFactura, List<Double> preciosProductos) {
    }

    public static void main(String[] args) {
        // Creación de dos instancias de la clase "factura".
        factura factura1 = new factura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
        factura factura2 = new factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

        // Cálculo del total de la factura 1 y factura 2.
        double totalValorFactura1 = calcularTotal(factura1);
        double totalValorFactura2 = calcularTotal(factura2);

        // Impresión de la factura 1 y factura 2.
        imprimirFactura(factura1, totalValorFactura1);
        imprimirFactura(factura2, totalValorFactura2);
    }

    // Método para calcular el total de una factura sumando los precios de los productos.
    static double calcularTotal(factura factura) {
        double total = 0;
        for (Double precio : factura.preciosProductos) {
            total += precio;
        }
        return total;
    }

    // Método para imprimir la información de una factura.
    static void imprimirFactura(factura factura, double total) {
        System.out.println("Factura");
        System.out.println("Cliente: " + factura.cliente());
        System.out.println("Fecha de Factura: " + factura.fechaFactura());
        System.out.println("Total: " + total);
        System.out.println();
    }
}
