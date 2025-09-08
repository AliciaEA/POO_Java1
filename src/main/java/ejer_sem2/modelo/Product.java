package ejer_sem2.modelo;

public class Product
{
    private String name;
    private Double price;
    private Integer stock;

    //Constructor vacio
    public Product()
    {
    }

    @Override
    public String toString()
    {
        return "\nProducto\n" +
                "nombre= " + name +
                "\nprecio (C$)= " + price +
                "\ncantidad= " + stock +
                '\n';
    }

    //Constructor con atributos name y price
    public Product(String name, Double price)
    {
        this.name = name;
        this.price = price;
    }

    //    Constructor con todos los atributos
    public Product(String name, Double price, Integer stock)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //Setter y Getter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Integer getStock()
    {
        return stock;
    }

    public void setStock(Integer stock)
    {
        this.stock = stock;
    }
}
