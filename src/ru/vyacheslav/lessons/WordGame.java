package ru.vyacheslav.lessons;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class WordGame
{
    public static void main(String[] args)
    {
        int menu, rndNum;
        String rndWord;
        String usrWord;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avacado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "qiwi", "mango", "mashroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Начать -1, выйти -0");
        do
        {
            menu = scan.nextInt();
        }while(menu>1 || menu<0);
        if(menu==1)
        {
            do
            {
                rndNum = rnd.nextInt(words.length);
                rndWord = words[rndNum];
                System.out.println(rndWord);
                System.out.println("Было загаданно случайное слово из предлженных");
                System.out.print("Введите слово: ");
                scan.nextLine();
                usrWord = scan.nextLine();
                do
                {
                    menu=scan.nextInt();
                }while(menu<0 | menu >1);
            }while(menu==1);
        }
        else;
        scan.close();
    }
}
