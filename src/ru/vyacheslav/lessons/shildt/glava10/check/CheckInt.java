package ru.vyacheslav.lessons.shildt.glava10.check;

public class CheckInt
{
    public boolean check(String num)
    {
        try
        {
            Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException exc)
        {
            return false;
        }
    }
//    public boolean checkChar()
}
