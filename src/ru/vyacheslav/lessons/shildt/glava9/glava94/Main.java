package ru.vyacheslav.lessons.shildt.glava9.glava94;
import java.util.Arrays;

public class Main
{
    public static int size = 10;
    public static void main(String[] args)throws FullMass, MyException
    {
        int[] array1 = new int[size];
        System.out.println(Arrays.toString(array1));

        try
        {
            try
            {
                for (int i = 0; i < array1.length + 5; i++)
                {
                    if (i >= array1.length) throw new FullMass();
                    array1[i] = i * 2;
                }
            } catch (FullMass exc)
            {
//            System.out.println(exc.isArrFull());
//            throw new MyException("Вызван исключением:"+ exc, exc)
                throw new RuntimeException("Исключение", exc);
            }
        }
        catch(RuntimeException ex)
        {
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//            System.out.println("Исключение было вызвано исключением: "+ ex.getCause());
        }
        System.out.println(Arrays.toString(array1));
    }
}
