package ru.vyacheslav.lessons;
import java.util.Scanner;
import java.util.Random;
public class TicTacToeNew
{
    private static final char USR_DOT ='X';
    private static final char AI_DOT ='O';
    private static final char EMPTY_DOT ='*';
    private static Scanner scan = new Scanner(System.in);
    private static Random rnd = new Random();

    private static char[][] field;
    private static int fieldSizeY;
    private static int fieldSizeX;

    public static void main(String[] args)
    {
        initMap(3,3);
        showMap();
        while(true)
        {
            humanTern();
            if(checkWin(USR_DOT))
            {
                System.out.println("Победил игрок");
                break;
            }
            if(isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            showMap();
            aiTern();
            if(checkWin(AI_DOT))
            {
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            showMap();
        }
    }
    private static void initMap(int ySize,int xSize)
    {
        fieldSizeY=ySize;
        fieldSizeX=xSize;
        field=new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++)
        {
            for (int j = 0; j < fieldSizeX; j++)
            {
                field[i][j]=EMPTY_DOT;
            }
        }
    }
    private static void showMap()
    {
        System.out.println();
        System.out.print("+ ");
        for (int i = 0; i <fieldSizeX ; i++) System.out.print((i+1)+" ");
        System.out.println();
        for (int i = 0; i <fieldSizeY ; i++)
        {
            System.out.print((i+1)+" ");
            for (int j = 0; j <fieldSizeX ; j++)
            {
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void humanTern()
    {
        System.out.println("Введите координаты для хода: ");
        int y;
        int x;
        do
        {
            y = scan.nextInt();
            x = scan.nextInt();
        }while((y<0 || y>fieldSizeY && x<0 || x>fieldSizeY) && (field[y-1][x-1]!=EMPTY_DOT));
        field[y-1][x-1]=USR_DOT;
    }
    private static void aiTern()
    {
        int y;
        int x;
        do
        {
            y = rnd.nextInt(fieldSizeY);
            x = rnd.nextInt(fieldSizeX);
        }while(field[y][x]!=EMPTY_DOT);
        field[y][x]=AI_DOT;
    }
    private static boolean isMapFull()
    {
        for (int i = 0; i < fieldSizeY ; i++)
        {
            for (int j = 0; j < fieldSizeX; j++)
            {
                if(field[i][j]==EMPTY_DOT) return false;
            }
        }
        return true;
    }
    private static boolean checkWin(char hc){return false;}
}
