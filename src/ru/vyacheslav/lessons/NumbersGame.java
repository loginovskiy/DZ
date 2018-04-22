package ru.vyacheslav.lessons;
import java.util.Random;
import java.util.Scanner;
public class NumbersGame
{
    public static void main(String[] args)
    {
        int rndNum, usrNum, menu;       //объявление целочисленных переменных;
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);      //объявление переменных типа Random и Scanner;
        System.out.println("Начать игру -1, Выход -0");
        do
        {
            menu=scan.nextInt();
        }while(menu>1 | menu<0);
        if(menu==1)
        {
            do
            {
                rndNum=rnd.nextInt(10);
                //System.out.println(rndNum);
                System.out.println("Было сгенерировано случайное число от 1 до 10, попробуте угадать его с 3-х попыток");
                for (int i = 0; i < 3 ; i++)
                {
                    do
                    {
                        usrNum = scan.nextInt();
                        if(usrNum>10 | usrNum<0) System.out.println("Вы ввели число вне заданного диапазона");
                    }while(usrNum>10 | usrNum<0);
                    if(usrNum>rndNum) System.out.println("Вы не угадали, введённое число больше заданного");
                    else if(usrNum<rndNum) System.out.println("Вы не угадали, введённое число меньше заданного");
                    else
                    {
                        System.out.println("Поздравляю, вы угадали");
                        break;
                    }
                }
                System.out.println("Для продолжения -1, для выхода -0");
                menu=scan.nextInt();
            }while(menu==1);
        }
            else;
        scan.close();
    }
}
