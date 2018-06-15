package ru.vyacheslav.lessons.shildt.glava10.consoletest;
import java.io.Console;
public class ConsoleTest
{
    public static void main(String[] args)
    {
        String name = null, surename=null;
        try
        {
            Console console = System.console();
            if (console != null)
            {
                name = console.readLine("Введите имя: ");
                surename = console.readLine("Введите фамилию: ");
            }
            console.printf("Здравствуйте %s  %s" , name, surename);
        }
        catch(NullPointerException exc)
        {
            System.out.println("Не удалось получить консоль " +exc);
        }
    }
}

