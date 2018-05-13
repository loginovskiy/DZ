package ru.vyacheslav.lessons.shildt.glava81;

public class intQueue implements Queue
{
    public static int counter;
    int[] array;
    private int putloc, size;
    int tmp1, tmp2;
    public intQueue(int size)
    {
        this.size=size;
        array = new int[size+1];
        putloc=0;
        counter=0;
    }
    @Override
    public void put(int val)
    {
        if(putloc>size)
        {
            System.out.println("Очередь заполнена!");
            return;
        }
        array[putloc]=val;
        move(1);
        putloc++;
    }
    @Override
    public int get()
    {
        if(putloc==0)
        {
            System.out.println("Очередь пуста");
            return 0;
        }
        putloc--;
        return array[putloc];
    }

    @Override
    public void move(int n)
    {
        if(n>0)
        {
            counter++;
            tmp1 = array[0];
            for (int i = 1; i <= counter; i++)
            {
                tmp2 = array[i];
                array[i] = tmp1;
                tmp1 = tmp2;
            }
        }
        else
        {
            tmp1 = array[counter];
            counter --;
            for (int i = 0; i < ; i++)
            {
                tmp2=array[counter];
                array[counter]=tmp1;
                tmp1=tmp2;
            }
        }
    }
}
