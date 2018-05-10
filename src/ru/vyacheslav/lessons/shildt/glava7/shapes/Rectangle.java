package ru.vyacheslav.lessons.shildt.glava7.shapes;

public class Rectangle extends TwoDShapes
{
    private String style;
    Rectangle()
    {
        super();
        style="none";
    }
    Rectangle(double width, double height, String style)
    {
        super(width,height,"Прямоуголник");
        this.style=style;
    }
    Rectangle(double width, String style)
    {
        super(width, "Квадрат");
        this.style=style;
    }
    Rectangle(Rectangle ob, String style)
    {
        super(ob);
        this.style=style;
    }
    public double area()
    {
        return getHeight()*getWidth();
    }
}
