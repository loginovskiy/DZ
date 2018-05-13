package ru.vyacheslav.lessons.shildt.glava8;

public class Main
{
    public static void main(String[] args)
    {
        Interface two = new ByTwos();

        for (int i = 0; i < 5 ; i++)
        {
            System.out.println("Следующее значение: "+ two.getNext()+" Квадрат этого числа: "+two.square());
        }
        ((ByTwos) two).message();
    }
}
