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
        initMap(3,3);
        printMap();
//        while(true)
//        {
//            humanTern();
//            if(checkWin(HUMAN_DOT))
//            {
//                System.out.println("Выйграл игрок");
//                break;
//            }
//            if(isMapFull())
//            {
//                System.out.println("Ничья");
//                break;
//            }
//            aiTurn();
//            printMap();
//            if(checkWin(AI_DOT))
//            {
//                System.out.println("Выйграл компьютер");
//                break;
//            }
//            if(isMapFull())
//            {
//                System.out.println("Ничья");
//                break;
//            }
//        }
        scn.close();
    }
    private static void initMap(int sizeY, int sizeX)
    {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY ; i++)
            for (int j = 0; j < fieldSizeX ; j++)
            {
                field[i][j] = EMPTY_DOT;
            }
    }
    private static void printMap()
    {
        System.out.print("+ ");
        for (int i = 1; i <= fieldSizeX ; i++) System.out.print(i+" ");
        System.out.println();
        for (int i = 0; i < fieldSizeY ; i++)
        {
            System.out.print(i+1+" ");
            for (int j = 0; j < fieldSizeX; j++)
            {
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void humanTern()
    {
        System.out.print("Выберете строку для хода: ");
        int num1 = scn.nextInt();
        num1-=1;
        System.out.print("Выберете столбец для хода: ");
        int num2 = scn.nextInt();
        num2-=1;
        field[num1][num2]=HUMAN_DOT;
    }
    private static void aiTurn(){}
    private static boolean checkWin(char c){return false;}
    private static boolean isMapFull(){return false;}
}
