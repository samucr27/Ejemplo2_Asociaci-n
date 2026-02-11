package org.example;

public class Main {

    public static void main(String[] args) {

        Pedido ped1 = new Pedido("P1","Juan");
        Pedido ped2 = new Pedido("P2","Carlos");
        Pedido ped3 = new Pedido("P3","John");

        Producto p1 = new Producto("pr1","Teclado",120000);
        Producto p2 = new Producto("pr2","Mouse",200000);
        Producto p3 = new Producto("pr3","Pantalla",300000);


        ped1.agregarProducto(p1);
        ped1.agregarProducto(p2);
        ped1.agregarProducto(p3);


        ped2.agregarProducto(p1);
        ped2.agregarProducto(p2);
        ped2.agregarProducto(p3);


        ped3.agregarProducto(p1);
        ped3.agregarProducto(p2);
        ped3.agregarProducto(p3);


        System.out.println(ped1.toString());
        System.out.println(ped2.toString());
        System.out.println(ped3.toString());

    }
}
