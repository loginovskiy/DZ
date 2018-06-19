package ru.vyacheslav.lessons.windowslsn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel
{
    Map()
    {
        setBackground(Color.BLACK);
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                mouseRelease(e);
            }
        });
    }
    private void mouseRelease(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
//        System.out.println("X= "+ x+" Y= "+y);
        if((x>0 & y>0) & (x<196 & y<171)) System.out.println("Ячейка 1");
        else if((x>195 & y>0) & (x<401 & y<171)) System.out.println("Ячейка 2");
        else if((x>400 & y>0) & (x<601 & y<171)) System.out.println("Ячейка 3");

        else if((x>0 & y>170) & (x<196 & y<371)) System.out.println("Ячейка 4");
        else if((x>195 & y>170) & (x<401 & y<371)) System.out.println("Ячейка 5");
        else if((x>400 & y>170) & (x<601 & y<371)) System.out.println("Ячейка 6");

        else if((x>0 & y>370) & (x<196 & y<544)) System.out.println("Ячейка 7");
        else if((x>195 & y>370) & (x<401 & y<544)) System.out.println("Ячейка 8");
        else if((x>400 & y>370) & (x<601 & y<544)) System.out.println("Ячейка 9");
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
        g.drawLine(0, 170, 600,170);
        g.drawLine(0,370,600,370);
        g.drawLine(195,600,195,0);
        g.drawLine(400, 600, 400, 0);
    }
}
