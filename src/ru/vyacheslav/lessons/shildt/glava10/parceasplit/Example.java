package ru.vyacheslav.lessons.shildt.glava10.parceasplit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example
{
    private final static int SIZE=2;
    private String entered;
    private String[] buffer, temp ;
    Example()
    {
        temp=new String[SIZE];

    }
    String[] splitString(String entered)
    {
        int counter=0;
        this.entered = entered;
        buffer=entered.split(" ");
        for(String tempa: buffer)
        {
            if(counter==2)break;
            temp[counter]=tempa;
            counter++;
        }
        return temp;
    }
    public boolean checkInt(String num)
    {
        try
        {
            Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException exc)
        {
            return false;
        }
    }
    public int[] parse (String[] arr)
    {
        int[] array = new int[SIZE];
        for (int i = 0; i < arr.length ; i++)
        {
            array[i]=Integer.parseInt(arr[i]);
        }
        return array;
    }
}
