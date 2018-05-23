package ru.vyacheslav.lessons.shildt.glava9.glava93;

public class Main
{
    public static void main(String[] args)
    {
        int a=88, b=0;
        int result;
        char[] chrs={'A','B','C'};

        for (int i = 0; i < 2 ; i++)
        {
            try
            {
                if(i==0) result=a/b;
                else chrs[5]='X';
            }
            catch(final ArithmeticException | ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Перехваченное исключение: "+ e);
            }
        }
    }
}
