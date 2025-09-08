package ejer_sem2;

import ejer_sem2.modelo.Bus;
import ejer_sem2.modelo.Cooperative;

public class Ejer4
{
    public static void main(String[] args)
    {
        //Crear cooperativa
        var Cooperative = new Cooperative("Transportes del Norte");

        //Todos los buses
        var bus1 = new Bus("M222893", 25);
        var bus2 = new Bus("M222894", 30);
        var bus3 = new Bus("M222895", 35);

        //Agregar buses a la cooperativa
        Cooperative.AddBus(bus1);
        Cooperative.AddBus(bus2);
        Cooperative.AddBus(bus3);

        System.out.println("Cooperativa: " + Cooperative.getName() + "\nBuses: ");
        for (Bus bus : Cooperative.getBuses())
        {
            System.out.println(bus);
        }

    }
}
