package ru.vyacheslav.lessons.shildt.glava10.parceasplit;

import java.io.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String entered;
        String[] arr;
        Example checking = new Example();
        try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.print("Введите координаты: ");
            do
            {
                entered = read.readLine();
                arr = checking.splitString(entered);
                //System.out.println();
                if(!(checking.checkInt(arr[0]) & checking.checkInt(arr[1])))
                    System.out.println("Неверный формат ввода, введите ещё раз");
            }while(!(checking.checkInt(arr[0]) & checking.checkInt(arr[1])));

            int[] arr1 = checking.parse(arr);
            System.out.println(Arrays.toString(arr1));
        }
        catch(IOException exc)
        {
            System.out.println("Ошибка ввода вывода" + exc);
        }
    }
}
