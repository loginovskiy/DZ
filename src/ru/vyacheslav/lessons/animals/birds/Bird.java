package ru.vyacheslav.lessons.animals.birds;

import ru.vyacheslav.lessons.animals.Animal;

public class Bird extends Animal
{
    public Bird(String name, String color)
    {
        super(name,color);
    }
    @Override
    public void voice()
    {
        System.out.println(name +" Поёт");
    }
    @Override
    public void move()
    {
        System.out.println("Летает по воздуху");
    }
}
