package ru.vyacheslav.lessons.animals;

public class Animal
{
    protected String name;
    protected String color;

    public Animal(String name, String color)
    {
        this.name=name;
        this.color=color;
    }

    protected void move()
    {
        System.out.println(name + " ходит лапами по земле");
    }
    public void voice() {}
    public String getColor() { return color;}
    public String  getName() {return name;}
}
