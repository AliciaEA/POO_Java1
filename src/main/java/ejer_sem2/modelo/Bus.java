package ejer_sem2.modelo;

public class Bus
{
    private String plate;
    private int capacity;

    public Bus(String plate, int capacity)
    {
        this.plate = plate;
        this.capacity = capacity;
    }

    @Override
    public String toString()
    {
        return "\nBus\n" +
                "placa= " + plate +
                "\ncapacidad= " + capacity +
                '\n';
    }
}
