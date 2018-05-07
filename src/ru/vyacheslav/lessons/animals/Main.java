package ru.vyacheslav.lessons.animals;

import ru.vyacheslav.lessons.animals.cats.Cat;
import ru.vyacheslav.lessons.animals.dogs.Dog;
import ru.vyacheslav.lessons.animals.birds.Bird;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Шарик", "чёрного");
        Cat cat = new Cat("Барсик","белого");
        Bird bird = new Bird("Соловей", "жёлтого", 20);

        Animal[] animal = new Animal[3];
        animal[0] = dog;
        animal[1] = cat;
        animal[2] = bird;

        for (int i = 0; i < animal.length ; i++)
        {
            animal[i].move();
            if(animal[i] instanceof Bird)
            {
                ((Bird)animal[i]).fly();
            }
        }

//        dog.move();
//        dog.voice();
//        System.out.println(dog.getName()+" "+dog.getColor()+" цвета");
//        cat.move();
//        cat.voice();
//        System.out.println(cat.getName()+" "+cat.getColor()+" цвета");
//        bird.move();
//        bird.voice();
//        System.out.println(bird.getName()+" "+bird.getColor()+" цвета");
    }
}
