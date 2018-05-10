package ru.vyacheslav.lessons.shildt.glava7.shapes;

public class Triangle extends TwoDShapes
{
    private String style;
    public Triangle()
    {
        super();
        style="none";
    }
    public Triangle(double width, double height, String style)
    {
        super(width,height,"Треугольник");
        this.style=style;
    }
    public Triangle(double width, String style)
    {
        super(width, "Треугольник");
        this.style=style;
    }
    public Triangle(TwoDShapes ob, String style)
    {
        super(ob);
        this.style=style;
    }
    public double area()
    {
        return getHeight()*getWidth()/2;
    }
}
