package ru.vyacheslav.lessons.windowslsn;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel
{
    Map()
    {
        setBackground(Color.white);

    }
    public void startNewGame()
    {
        System.out.println("NewGame");
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawLine(40, 40, 300,300);
        g.setColor(Color.RED);
        g.fillOval(40,40, 30,30);
    }
}
