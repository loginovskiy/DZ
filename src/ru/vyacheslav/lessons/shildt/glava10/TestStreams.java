package ru.vyacheslav.lessons.shildt.glava10;
import java.io.*;
import java.util.Arrays;

public class TestStreams
{
    public static int a;
    public static void main(String[] args)
            throws IOException
    {
        byte[] data = new byte[10];

        System.in.read(data);
        for (int i = 0; i < data.length ; i++)
        {
            System.out.print((char)data[i]);
        }
    }
}
