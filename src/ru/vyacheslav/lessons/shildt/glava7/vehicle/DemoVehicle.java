package ru.vyacheslav.lessons.shildt.glava7.vehicle;
import java.util.Scanner;
public class DemoVehicle
{
    public static void main(String[] args)
    {
        int x;
        Scanner scn = new Scanner(System.in);
        Vehicle vehicle1 = new Miniven((short)7, (short)70, (short)11);
        Vehicle vehicle2 = new SportCar((short)2, (short)60, (short)14);
        Vehicle vehicle3 = new Track((short)2,(short)120,(short)20,(short)7000);
        System.out.println("1.Минивен\n2.Спорткар\n3.Грузовик");
        x=scn.nextInt();
        switch (x){
            case 1:
            {
                System.out.println("Транспортное средство минивен" + "\nКол-во пассажиров: " + vehicle1.getPassengers() +
                        "\nОбъём бака: " + vehicle1.getFuelcap() + "\nРасход на 100км: " + vehicle1.getKpl());
                break;
            }
            case 2:
            {
                System.out.println("Транспортное средство спорткар" + "\nКол-во пассажиров: " + vehicle2.getPassengers() +
                        "\nОбъём бака: " + vehicle2.getFuelcap() + "\nРасход на 100км: " + vehicle2.getKpl());
                break;
            }
            case 3:
            {
                System.out.println("Транспортное средство спорткар" + "\nКол-во пассажиров: " + vehicle3.getPassengers() +
                        "\nОбъём бака: " + vehicle3.getFuelcap() + "\nРасход на 100км: " + vehicle3.getKpl()+ "\nГрузоподъёмность: "+
                        ((Track)vehicle3).getCargo());
                break;
            }
        }
    }
}
