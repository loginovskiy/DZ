package ru.vyacheslav.lessons.windowslsn;

import javafx.scene.layout.BorderRepeat;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Window();
            }
        });
    }

    JButton exitBtn = new JButton("EXIT");
    JButton newGameBtn = new JButton("NewGame");
    public Window()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel bottomPanel = new JPanel (new GridLayout(1,2));
        bottomPanel.add(exitBtn);
        bottomPanel.add(newGameBtn);
        add(bottomPanel, BorderLayout.SOUTH);
        Map map = new Map();
        add(map, BorderLayout.CENTER);
        setVisible(true);
    }
}
