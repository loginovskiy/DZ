package ru.vyacheslav.lessons.animals.dogs;

import ru.vyacheslav.lessons.animals.Animal;

public class Dog extends Animal
{
    public Dog(String name, String color)
    {
        super(name,color);
    }
    @Override
    public void voice() { System.out.println(name + " лает");}
}
