package ru.vyacheslav.lessons;

public class Recursy
{
    public static void main(String[] args)
    {
        int x;
        x=100;
        division(x);
    }
    static void division(int a)
    {
        int count=0;
        int div;
        div=a/2;
        if(a/2==1)return;
        System.out.println("div= "+div);
        count++;
        division(div);
    }
}
