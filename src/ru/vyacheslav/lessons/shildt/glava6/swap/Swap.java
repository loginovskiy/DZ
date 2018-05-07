package ru.vyacheslav.lessons.shildt.glava6.swap;

public class Swap
{
    int a;
    Swap(int i)
    {
        this.a=i;
    }
    public void swap(Swap obj)
    {
       int temp;
       temp=obj.a;
       obj.a=a;
       a=temp;
    }
}
