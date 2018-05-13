package ru.vyacheslav.lessons.shildt.glava7.shapes;

public class Main
{
    public static void main(String[] args)
    {
        TwoDShapes[] object = new TwoDShapes[5];
        object[0] = new Triangle(5,4, "Закрашеный");
        object[1] = new Rectangle(4,"Контурный");
        object[2] = new Triangle(object[0], "Контурный");
        object[3] = new Rectangle(5,6,"Закрашенный");
        object[4] = new Circle(3,"Закрашенный");

        System.out.print("Фигура: "+ object[0].getName()+" Высота: "+ object[0].getHeight()+" Ширина: "+ object[0].getWidth()
                +" Площадь "+object[0].area()+"\n");
        System.out.print("Фигура: "+ object[1].getName()+" Высота: "+ object[1].getHeight()+" Ширина: "+ object[1].getWidth()
                +" Площадь "+object[1].area()+"\n");
        System.out.print("Фигура: "+ object[2].getName()+" Высота: "+ object[2].getHeight()+" Ширина: "+ object[2].getWidth()
                +" Площадь "+object[2].area()+"\n");
        System.out.print("Фигура: "+ object[3].getName()+" Высота: "+ object[3].getHeight()+" Ширина: "+ object[3].getWidth()
                +" Площадь "+object[3].area()+"\n");
        System.out.print("Фигура: "+ object[4].getName()+" Радиус: "+ object[4].getWidth()
                +" Площадь "+object[4].area()+"\n");
    }
}
