package ru.vyacheslav.lessons.shildt.glava9.glava92;

public class ThrowsDemo
{
    public static char prompt(String str)
        throws java.io.IOException
    {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }
}
