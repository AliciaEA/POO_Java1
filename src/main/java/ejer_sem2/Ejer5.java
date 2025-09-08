package ejer_sem2;

import ejer_sem2.modelo.House;

public class Ejer5
{
    public static void main(String[] args)
    {
        var house = new House("Casa de Alicia");

        for (var room : house.getRooms())
        {
            System.out.println(room);
        }
    }
}
