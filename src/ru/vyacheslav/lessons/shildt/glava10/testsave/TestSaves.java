package ru.vyacheslav.lessons.shildt.glava10.testsave;
import java.io.*;
public class TestSaves
{
    public static void main(String[] args)throws FileNotFoundException,IOException, NotSerializableException
    {
        CreateFields field;
        CreateFields[] arr = new CreateFields[10];
        CreateFields[] arrin;
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = new CreateFields(i+3);
        }

        try(ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Saves.bin"));
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("Saves.bin")))
        {
            save.writeObject(arr);
            arrin=(CreateFields[])read.readObject();
            for (int i = 0; i < arrin.length ; i++)
            {
               arrin[i].showField();
            }
        }

        catch(FileNotFoundException | NotSerializableException | ClassNotFoundException exc)
        {
            System.out.println("Файл не найден"+" "+"Ошибка записи в файл");
        }
    }
}
