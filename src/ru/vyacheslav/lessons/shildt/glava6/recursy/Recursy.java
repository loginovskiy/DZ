package ru.vyacheslav.lessons.shildt.glava6.recursy;

public class Recursy
{
    private String str="";
    int i;
    Recursy(String str)
    {
        this.str=str;
    }
    public void showString(int i)
    {
        if((i+1)>str.length())return;
        showString(i+1);
        System.out.print(str.charAt(i));
    }
}
