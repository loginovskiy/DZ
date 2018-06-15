package ru.vyacheslav.lessons.shildt.glava10.сharstreamexmpl;

import java.io.PrintWriter;

public class PrintWriterEXPL
{
    public static void main (String[] args)
    {
        try(PrintWriter prt = new PrintWriter(System.out);)
        {
            prt.print("HalloWorld");
        }
    }
}
