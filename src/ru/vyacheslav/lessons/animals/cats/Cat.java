package ru.vyacheslav.lessons.animals.cats;

import ru.vyacheslav.lessons.animals.Animal;

public class Cat extends Animal
{

    public Cat(String name, String color)
    {
        super(name, color);
    }
    @Override
    public void voice()
    {
        System.out.println(name + " мяукает");
    }
}
