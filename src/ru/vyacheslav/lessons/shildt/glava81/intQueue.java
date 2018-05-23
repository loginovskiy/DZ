package ru.vyacheslav.lessons.shildt.glava81;

public class intQueue implements Queue
{
    public static int putloc;
    int[] array;
    private int size, tmp1, tmp2;

    public intQueue(int size)
    {
        this.size=size;
        array = new int[size+1];
        putloc=0;
    }
    @Override
    public void put(int val)
    {
        if(putloc==size)
        {
            System.out.println("Очередь заполнена!");
            return;
        }
        array[putloc]=val;
        putloc++;
    }
    @Override
    public int get()
    {
        if(putloc==0)
        {
            System.out.print("Очередь пуста ");
            return 0;
        }
        move();
        return tmp1;
    }

    @Override
    public void move()
    {
        tmp1=array[putloc];
        for (int i = putloc-1; i >=0 ; i--)
        {
            tmp2=array[i];
            array[i]=tmp1;
            tmp1=tmp2;
        }
        putloc--;

    }
}
