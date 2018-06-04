package ru.vyacheslav.lessons.shildt.glava10.сharstreamexmpl;
import java.io.*;
public class ReadChar
{
    public static void main(String[] args)throws IOException
    {
        int i=0;
        char c;
        char[] arr = new char[2];
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.println("Введите символы; окончание ввода - символ точки ");
            do
            {
                c = (char) br.read();
                if (c == ' ' | !br.ready())continue;
                arr[i]=c;
                i++;
            }while(i<arr.length);
            System.out.println("Значение arr[0]= "+ arr[0]+" Значение arr[1]= "+ arr[1]);
        }
        catch(IOException exc)
        {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
