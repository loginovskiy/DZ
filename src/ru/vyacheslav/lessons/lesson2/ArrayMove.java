package ru.vyacheslav.lessons.lesson2;
import java.util.Arrays;
import java.util.Random;
public class ArrayMove
{
    private static int n=2;
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]=rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        moveArr(n,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveArr(int n, int[] array)
    {
        int temp, tmp1, tmp2, num;
        num=n>=0?n:n*(-1);
        if(n>=0)
            while(num>0)
            {
                temp = array[array.length - 1];
                tmp1 = array[0];
                for (int i = 1; i < array.length; i++)
                {
                    tmp2=array[i];
                    array[i]=tmp1;
                    tmp1=tmp2;
            }
            array[0]=temp;
            num--;
            }
        if(n<0)
            while(num>0)
            {
                temp=array[0];
                tmp1=array[array.length-1];
                for (int i = array.length-2; i >= 0 ; i--)
                {
                    tmp2=array[i];
                    array[i]=tmp1;
                    tmp1=tmp2;
                }
                array[array.length-1]=temp;
                num--;
            }
    }
}
