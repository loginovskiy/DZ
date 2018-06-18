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

    }
}
