package ru.vyacheslav.lessons.shildt.glava6.swap;

public class Main
{
    public static void main(String[] args)
    {
        Swap val1 = new Swap(2);
        Swap val2 = new Swap(4);

        val1.swap(val2);
        System.out.println("val1.a= "+ val1.a +" val2.a= "+ val2.a);
    }
}
