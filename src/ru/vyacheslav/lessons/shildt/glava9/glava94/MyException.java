package ru.vyacheslav.lessons.shildt.glava9.glava94;

public class MyException extends Exception
{
    public MyException(String msg, Throwable cause)
    {
        super(msg, cause);
    }
    public String message()
    {
        return "Исключение";
    }
}
