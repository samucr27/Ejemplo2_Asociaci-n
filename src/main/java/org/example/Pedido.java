package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String numero;
    private String cliente;
    private List<Producto> productos;

    public Pedido(String numero, String cliente, List<Producto> productos) {
        this.numero = numero;
        this.cliente = cliente;
        this.productos = new ArrayList<>(productos);
    }

    public Pedido(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarDetalle() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {

        String texto = "";
        double total = 0;

        texto += "Pedido: " + numero + "\n";
        texto += "Cliente: " + cliente + "\n";
        texto += "Productos:\n";

        for (Producto p : productos) {
            texto += "- " + p.toString() + "\n";
            total += p.getPrecio();
        }

        texto += "Total: " + total + "\n";

        return texto;
    }
}
