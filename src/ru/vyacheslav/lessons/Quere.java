package ru.vyacheslav.lessons;
class Que
{
    private int putloc,getloc;
    private int[] intArr;
    private char[] charArr;
    private double[] doubArr;
    Que(int size)
    {
        intArr = new int[size+1];
        putloc=getloc=0;
    }
    Que(int size, char a)
    {
        charArr = new char[size+1];
        putloc=getloc=0;
    }
    Que(int size, double a)
    {
        doubArr = new double[size];
        putloc=getloc=0;
    }

    void put(int val)
    {
        if(!inRange(putloc, intArr.length-1))
        {
            System.out.println("Очередь заполнена");
            return;
        }
        intArr[putloc]=val;
        putloc++;
    }
    void put(char val)
    {
        if(!inRange(putloc, charArr.length-1))
        {
            System.out.println("Очередь заполнена");
            return;
        }
        charArr[putloc]=val;
        putloc++;
    }
    void put(double val)
    {
        if(!inRange(putloc, doubArr.length-1))
        {
            System.out.println("Очередь заполнена");
            return;
        }
        doubArr[putloc]=val;
        putloc++;
    }
    private boolean inRange(int putIndex, int size)
    {
        return putIndex<size;
    }
    private void errMsg(){};

}


public class Quere
{
    public static void main(String[] args)
    {
        final int size=10;
        Que que1=new Que(size);
    }
}
