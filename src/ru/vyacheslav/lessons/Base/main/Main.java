package ru.vyacheslav.lessons.Base.main;
import ru.vyacheslav.lessons.Base.humans.Humans;

public class Main
{
    public static final int QUANITY = 5;
    public static void main(String[] args)
    {
        Humans[] human = new Humans[QUANITY];
        human[0] = new Humans("Иванов", "Сергей", "Иванович", "Менеджер", "i.ivanov@romashka.com", 40000);
        human[1] = new Humans("Сидоров", "Пётр", "Валентинович", "Экспедитор", "p.sidorov@romashka.com", 45000);
        human[2] = new Humans("Мухина", "Екатерина", "Олеговна", "Оператор", "e.mukhina@romashka.com", 32000);
        human[3] = new Humans("Сахарова", "Оксана", "Максимовна", "Директор по маркетингу", "o.sakharova@romashka.com", 65000);
        human[4] = new Humans("Петров","Иван", "Никитич", "Генеральный директор", "bigboss@romashka.com", 320000);

        for (int i = 0; i < QUANITY ; i++)
        {
            if(human[i].getAge()>45) human[i].showHuman();
        }
    }
}
