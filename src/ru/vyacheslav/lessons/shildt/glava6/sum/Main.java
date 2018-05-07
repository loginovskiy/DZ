package ru.vyacheslav.lessons.shildt.glava6.sum;

public class Main
{
    public static int sum = 0;
    public static void main(String[] args)
    {
        sum(5,6,2,1);

        System.out.println(sum);
    }
    public static void sum(int ...i)
    {
        for (int j = 0; j < i.length ; j++)
        {
            sum+=i[j];
        }

    }
}
