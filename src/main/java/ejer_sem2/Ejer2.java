package ejer_sem2;

import ejer_sem2.modelo.Product;

public class Ejer2
{
    public static void main(String[] args)
    {
        //Producto 1 con constructor vacio
        var product1 = new Product();
        product1.setName("Tubo de PVC");
        product1.setPrice(15.50);
        product1.setStock(100);

        //Producto 2 con constructor con atributos name y price
        var product2 = new Product("Cemento", 100.00);
        product2.setStock(50);

        //Producto 3 con constructor con todos los atributos
        String name = "Ladrillo";
        Double price = 1.50;
        int stock = 1000;
        var product3 = new Product(name, price, stock);

        System.out.println("Productos en la lista, agregados con diferentes constructores:");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

    }
}
