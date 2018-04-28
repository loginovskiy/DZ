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
    private static int menu;
    public static void main(String[] args)
    {
        do
        {
            initMap(3, 3);
            showMap();
            while (true)
            {
                humanTern();
                showMap();
                if (checkWin(USR_DOT))
                {
                    System.out.println("Победил игрок");
                    break;
                }
                if (isMapFull())
                {
                    System.out.println("Ничья");
                    break;
                }
                aiTern();
                showMap();
                if (checkWin(AI_DOT))
                {
                    System.out.println("Победил компьютер");
                    break;
                }
                if (isMapFull())
                {
                    System.out.println("Ничья");
                    break;
                }

            }
            System.out.print("Для того чтобы сыграть заново нажмите 1, чтобы выйти нажмите 0: ");
            do
            {
                menu=scan.nextInt();
            }while(menu<0 || menu>1);
        }while(menu==1);
        scan.close();
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
        System.out.print("Введите координаты для хода: ");
        int y;
        int x;
        do
        {
            do
            {
                while(!scan.hasNextInt())
                {
                    System.out.println("Введены не координаты");
                    scan.next();
                }

                y = scan.nextInt();
                x = scan.nextInt();
            } while (y < 0 || y > fieldSizeY && x < 0 || x > fieldSizeY);
        }while (field[y - 1][x - 1] != EMPTY_DOT);
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
    private static boolean checkWin(char ch)
    {
        int count1,count2;
        for (int i = 0; i < fieldSizeY ; i++)
        {
            count1=count2=0;
            for (int j = 0; j < fieldSizeX; j++)
            {
                if(field[i][j]==ch)count1++;
                if(field[j][i]==ch)count2++;
                if(count1==fieldSizeX | count2==fieldSizeY)return true;
            }
        }
        count1=count2=0;
        for (int i = 0; i < fieldSizeY ; i++)
        {
            if(field[i][i]==ch)count1++;
            if(field[(i)][((i-(fieldSizeY-1))*(-1))]==ch)count2++;
            if(count1==fieldSizeY |count2==fieldSizeY)return true;
        }
        return false;
    }
}
