package ru.vyacheslav.lessons.shildt.glava10.сharstreamexmpl;

import java.io.*;
import java.util.Arrays;
public class CharStreamEXMPL
{
    public static void main(String[] args)throws IOException
    {
        char[] buffer = new char[20];
        try
        {
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            bufReader.read(buffer);
            System.out.println(Arrays.toString(buffer));
        }
        catch(IOException exc)
        {
            System.out.println("Ошибка ввода вывода" + exc);
        }
    }
}
