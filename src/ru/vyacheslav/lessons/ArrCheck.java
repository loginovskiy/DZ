package ru.vyacheslav.lessons;

public class ArrCheck
{
    private static final char DOT='*';
    private static final char DOTx='X';
    private static final int ySIZE=11;
    private static final int xSIZE=11;

    public static void main(String[] args)
    {
        char[][] arr = new char[ySIZE][xSIZE];
        for (int i = 0; i <ySIZE ; i++)
        {
            for (int j = 0; j <xSIZE ; j++)
            {
                arr[i][j]=DOT;
            }
        }
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i][i]=DOTx;
        }
        for (int i = ySIZE-1; i >= 0; i--)
        {
            arr[i][(i-(ySIZE-1))*-1]=DOTx;
        }
        dispArr(arr);
    }
    private static void dispArr(char[][] array)
    {
        for (int i = 0; i <ySIZE ; i++)
        {
            for (int j = 0; j <xSIZE ; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
