package ru.vyacheslav.lessons.shildt.glava7.shapes;

public abstract class TwoDShapes
{
    private double width;
    private double height;
    private String name;
    public TwoDShapes()
    {
        width=height=0;
        name="none";
    }
    public TwoDShapes(double width, double height, String name)
    {
        this.width=width;
        this.height=height;
        this.name=name;
    }
    public TwoDShapes(double width, String name)
    {
       this.width=height=width;
       this.name=name;
    }
    public TwoDShapes(TwoDShapes ob)
    {
        this.width=ob.width;
        this.height=ob.height;
        this.name=ob.name;
    }

    public String getName()
    {
        return name;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    abstract double area();
}
