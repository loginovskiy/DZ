package ru.vyacheslav.lessons.animals.birds;

import ru.vyacheslav.lessons.animals.Animal;

public class Bird extends Animal
{
    int height;
    public Bird(String name, String color, int height)
    {
        super(name,color);
        this.height=height;
    }
    @Override
    public void voice()
    {
        System.out.println(name +" Поёт");
    }
    @Override
    public void move()
    {
        System.out.println(name + " прыгает по земле лапами");
    }
    public void fly()
    {
        System.out.println(name+" летает на высоте "+ height+" метров ");
    }

}
