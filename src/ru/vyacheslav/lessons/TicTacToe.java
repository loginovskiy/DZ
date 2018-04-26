package ru.vyacheslav.lessons;
import java.util.Scanner;
import java.util.Random;
public class TicTacToe
{
    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '*';
    private static final Scanner scn = new Scanner(System.in);
    private static final Random rnd = new Random();

    private static char[][] field;
    private static int fieldSizeY;
    private static int fieldSizeX;

    public static void main(String[] args)
    {
        initMap(3, 3);
        printMap();
        while (true)
        {
            humanTern();
            if (checkWin(HUMAN_DOT))
            {
                System.out.println("Выйграл игрок");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(AI_DOT))
            {
                System.out.println("Выйграл компьютер");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

        }
        scn.close();
    }

    private static void initMap(int sizeY, int sizeX)
    {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++)
            for (int j = 0; j < fieldSizeX; j++)
            {
                field[i][j] = EMPTY_DOT;
            }
    }

    private static void printMap()
    {
        System.out.print("+ ");
        for (int i = 1; i <= fieldSizeX; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++)
        {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < fieldSizeX; j++)
            {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTern()
    {
        int num1, num2;
        do
        {
            System.out.print("Введите координаты: ");
            num1 = scn.nextInt() - 1;
            num2 = scn.nextInt() - 1;
        } while (!isValidSell(num1, num2) || !isEmptySell(num1, num2));
        field[num1][num2] = HUMAN_DOT;

    }

    private static void aiTurn()
    {
        int num1, num2;
        do
        {
            num1 = rnd.nextInt(fieldSizeX);
            num2 = rnd.nextInt(fieldSizeY);
        } while (!isEmptySell(num1, num2));
        field[num1][num2] = AI_DOT;
    }

    private static boolean checkWin(char c)
    {
        int count = 0;
        for (int i = 0; i < fieldSizeY; i++)
        {
            count = 0;
            for (int j = 0; j < fieldSizeX; j++)
            {
                if (field[i][j] == c) count++;
            }
            return count == fieldSizeY;
        }
        for (int i = 0; i < fieldSizeY; i++)
        {
            count = 0;
            for (int j = 0; j < fieldSizeX; j++)
            {
                if (field[j][i] == c) count++;
            }
            return count == fieldSizeX;
        }
        for (int i = 0; i < field.length; i++)
        {
            if (field[i][i] == c) count++;
        }
        if (count == 3) return true;
        for (int i = fieldSizeY; i > 0  ; i--)
        {
            if(field[i][(i-(fieldSizeY-1))*-1]==c)count++;
        }
        if (count == 3) return true;
        return false;
    }


    private static boolean isMapFull()
    {
        for(int i=0; i<fieldSizeY; i++)
        {
            for (int j = 0; j < fieldSizeX; j++)
            {
               if(isEmptySell(i, j)) return false;

            }
        }
        return true;
    }
    private static boolean isValidSell(int x, int y)
    {
        return x>=0 && x<fieldSizeX && y>=0 && y<fieldSizeY;
    }
    private static boolean isEmptySell(int x, int y)
    {
        return field[x][y] == EMPTY_DOT;
    }
}
