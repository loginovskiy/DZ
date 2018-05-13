package ru.vyacheslav.lessons.shildt.glava8;

public class ByTwos implements Interface
{
    int start;
    int val;
    ByTwos()
    {
        start=val=0;
    }

    @Override
    public int getNext()
    {
        val+=2;
        return val;
    }

    @Override
    public void reset()
    {
        start=val=0;
    }

    @Override
    public void setStart(int start)
    {
        this.start=start;
        this.val=val;
    }

    @Override
    public int square()
    {
        return val*val;
    }

    public void message()
    {
        System.out.println("Этот метод не был объявлен в интерфейсе");
    }
}
