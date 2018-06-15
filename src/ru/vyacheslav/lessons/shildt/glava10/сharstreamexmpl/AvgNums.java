package ru.vyacheslav.lessons.shildt.glava10.сharstreamexmpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.println("Сколько чисел будет обработанно: ");
        str=rd.readLine();
        try
        {
            n = Integer.parseInt(str);
            System.out.println(n);
        }
        catch(NumberFormatException exc)
        {
            System.out.println("Неверный формат");
            n=0;
        }
    }
}
