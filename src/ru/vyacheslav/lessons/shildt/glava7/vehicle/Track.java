package ru.vyacheslav.lessons.shildt.glava7.vehicle;

public class Track extends Vehicle
{
    private short cargo;        //Грузоподъёмность
    public Track(short passengers, short fuelcap, short kpl, short cargo)
    {
        super(passengers, fuelcap, kpl);
        this.cargo=cargo;
    }
    public short getCargo()
    {
        return cargo;
    }
    public void putCargo(short cargo)
    {
        this.cargo = cargo;
    }
}
