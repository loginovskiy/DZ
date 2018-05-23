package ru.vyacheslav.lessons.shildt.glava10;
import java.io.*;
import java.util.Arrays;

public class TestStreams
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedInputStream str = new BufferedInputStream(System.in);
        int count;
        byte[] arr = new byte[10];
        count=str.read(arr,3,7);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
