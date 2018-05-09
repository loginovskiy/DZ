package ru.vyacheslav.lessons.shildt.glava7.vehicle;

public class Vehicle
{
    private short passengers;   //кол-во пассажиров
    private short fuelcap;      //объём топливного бака
    private short kpl;          //расход литров/100км

    public Vehicle(short passengers, short fuelcap, short kpl)
    {
        this.passengers=passengers;
        this.fuelcap=fuelcap;
        this.kpl=kpl;
    }

    public short range()
    {
        return (short)(fuelcap*kpl);
    }
    public float fuelneeded(short km)
    {
        return (float)km/kpl;
    }
    public short getPassengers()
    {
        return passengers;
    }
    public short getFuelcap()
    {
        return fuelcap;
    }
    public short getKpl()
    {
        return kpl;
    }
}
