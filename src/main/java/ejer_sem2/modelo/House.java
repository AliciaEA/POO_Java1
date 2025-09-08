package ejer_sem2.modelo;

import java.util.List;

public class House
{
    private String name;
    private List<Room> rooms;

    public House(String name)
    {
        this.name = name;
        this.rooms = new java.util.ArrayList<>();
        rooms.add(new Room("Entrada", "Una entrada acogedora con un perchero y un zapatero."));
        rooms.add(new Room("Sala de estar", "Una sala de estar cómoda con un sofá, una mesa de centro y una televisión."));
        rooms.add(new Room("Cocina", "Una cocina moderna con electrodomésticos de acero inoxidable y una isla central."));
        rooms.add(new Room("Comedor", "Un comedor elegante con una mesa grande y sillas a juego."));
        rooms.add(new Room("Dormitorio principal", "Un dormitorio espacioso con una cama king-size, un armario empotrado y un baño privado."));
        rooms.add(new Room("Baño principal", "Un baño lujoso con una bañera independiente, una ducha de lluvia y un lavabo doble."));

    }

    public List<Room> getRooms()
    {
        return rooms;
    }
}
