package ru.vyacheslav.lessons.quicksort;
import java.util.Arrays;
import java.util.Random;
public class QuickSort
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] array = new int[20];
        Qs quick = new Qs();
        for (int i = 0; i <array.length ; i++)
        {
            array[i]=rnd.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        quick.quicksort(array);
        System.out.println(Arrays.toString(array));
    }


}
