package ru.vyacheslav.lessons.shildt.glava81;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Queue queue = new intQueue(10);
        for (int i = 0; i < 12 ; i++)
        {
            queue.put(i*3);
        }
        //System.out.println(Arrays.toString(((intQueue) queue).array));
        for (int i = 0; i <5 ; i++)
        {
            System.out.print(queue.get()+" ");
        }
    }
}
