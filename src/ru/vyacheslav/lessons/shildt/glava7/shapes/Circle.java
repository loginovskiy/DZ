package ru.vyacheslav.lessons.shildt.glava7.shapes;
import java.lang.Math;
public class Circle extends TwoDShapes
{
    private String style;
    public Circle()
    {
        super();
        style="none";
    }
    public Circle(double radius, String style)
    {
        super(radius, "Круг");
        this.style=style;
    }
    public double area()
    {
        return Math.pow((super.getWidth()*2),2)*Math.PI;
    }
}
