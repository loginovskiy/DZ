package ru.vyacheslav.lessons.geek;

import javax.swing.*;

public class SwingEXMPL extends JFrame
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new SwingEXMPL();
            }
        });

    }

    public SwingEXMPL()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("TicTacToe");
        JButton btnExit = new JButton("EXIT");

        add(btnExit);

        setResizable(false);
        setVisible(true);



    }
}
