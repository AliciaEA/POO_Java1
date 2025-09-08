package ejer_sem2.modelo;

import java.util.List;

public class Cooperative
{
    private String name;

    private List<Bus> buses;

    public Cooperative(String name)
    {
        this.name = name;
        this.buses = new java.util.ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Bus> getBuses()
    {
        return buses;
    }

    public void AddBus(Bus bus)
    {
        this.buses.add(bus);
    }

    public void RemoveBus(Bus bus)
    {
        this.buses.remove(bus);
    }

    public void editBus(Bus bus)
    {
        int index = this.buses.indexOf(bus);
        if (index >= 0)
        {
            this.buses.set(index, bus);
        }
    }
}
