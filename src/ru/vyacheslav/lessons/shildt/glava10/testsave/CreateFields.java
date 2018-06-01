package ru.vyacheslav.lessons.shildt.glava10.testsave;

import java.io.Serializable;

public class CreateFields implements Serializable
{
    public final char USERDOT = 'X';
    public final char AIDOT = 'O';
    public final char EMPTYDOT = '*';
    public char[][] array;
    public int size;
    CreateFields(int size)
    {
        this.size=size;
        array = new char[size][size];
        for (int i = 0; i < size ; i++)
        {
            for (int j = 0; j < size ; j++)
            {
                array[i][j] = EMPTYDOT;
            }
        }
    }
    void showField()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size ; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
