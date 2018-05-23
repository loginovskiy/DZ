package ru.vyacheslav.lessons.shildt.glava9;

public class ArrayException
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        for (int i = 0; i < 12 ; i++)
        {
            try
            {
                array[i]=i;
            }
            catch (ArrayIndexOutOfBoundsException exc)
            {
                System.out.println("Выход за пределы массива");
            }


        }
            for (int j = 0; j <array.length ; j++)
            {
                System.out.print(array[j]);
            }
    }
}
