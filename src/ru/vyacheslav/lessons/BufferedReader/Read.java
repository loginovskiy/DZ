package ru.vyacheslav.lessons.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Read
{
    BufferedReader read = new BufferedReader(new Reader()
    {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException
        {
            return 0;
        }

        @Override
        public void close() throws IOException
        {

        }
    });
}
