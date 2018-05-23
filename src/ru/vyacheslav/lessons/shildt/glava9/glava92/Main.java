package ru.vyacheslav.lessons.shildt.glava9.glava92;
public class Main
{
    public static void main(String[] args)
    {
        char ch;
        try
        {
            ch = ThrowsDemo.prompt("Enter a letter");
        }
        catch(java.io.IOException exc)
        {
            System.out.println("Произошло исключение ввода вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали клавишу: "+ ch);
    }
}
