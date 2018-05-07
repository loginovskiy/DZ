package ru.vyacheslav.lessons.shildt.glava6;

import java.util.Arrays;

public class Stack
{
    private char[] stack;
    private int putloc,getloc;
    Stack(int size)
    {
        stack = new char[size+1];
        getloc=putloc=0;
    }
    public void put(char ch)
    {
        if(putloc==stack.length-1) System.out.println("Стек полон");
        else
        {
            stack[putloc] = ch;
            putloc++;
            getloc++;
            System.out.println("Данные внесены");
        }
    }
    public char get()
    {
        if(getloc==0)
        {
            System.out.println("Стек пуст");
            return 0;
        }
            stack[getloc]=' ';
            getloc--;
            putloc--;
            return stack[getloc];
    }
    public void showStack()
    {
        System.out.println(Arrays.toString(stack));
    }

}
