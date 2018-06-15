package ru.vyacheslav.lessons.shildt.glava10.check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public final static int SIZE=2;
    static String[] buff;
    public static void main(String[] args)
    {
        String[] temp = new String[SIZE];
        String edata;
        int j=0;
        CheckInt checkInt = new CheckInt();
        try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.print("Введите координаты: ");
//            do
//            {
                edata = read.readLine();
//                buff = edata.split(" ");
//                for (int i = 0; i < buff.length & i < temp.length; i++)
//                {
//                    temp[i] = buff[i];
//                }
//                System.out.println();
                for(String temps:edata.split(" "))
                {
                    if(j==2)break;
                    temp[j]=temps;
                    j++;
                }
                for (int i = 0; i < temp.length; i++)
                {
//
                    System.out.print(temp[i]+" ");
                }
//            }while(!(checkInt.check(temp[0]) & checkInt.check(temp[1])));
        }
        catch(IOException exc)
        {
            System.out.print("Ошибка ввода вывода");
        }
    }
}
