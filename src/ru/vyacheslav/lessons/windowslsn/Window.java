package ru.vyacheslav.lessons.windowslsn;

import javafx.scene.layout.BorderRepeat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener
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
        newGameBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        JPanel bottomPanel = new JPanel (new GridLayout(1,2));
        bottomPanel.add(exitBtn);
        bottomPanel.add(newGameBtn);
        add(bottomPanel, BorderLayout.SOUTH);
        Map map = new Map();
        add(map, BorderLayout.CENTER);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if( e.getSource() == newGameBtn) System.out.println("Была нажата кнопка NEWGAME");
        else if(e.getSource() == exitBtn) System.out.println("Была нажата кнопка EXIT");
    }
}
