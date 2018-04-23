package ru.vyacheslav.lessons;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
public class WordGame
{
    public static void main(String[] args) //throws IOException
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
                //System.out.println(rndWord);
                System.out.println("Было загаданно случайное слово из предлженных: ");
                System.out.println(Arrays.toString(words));
                //BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

                char[] disp = new char[rndWord.length()];
                for (int i = 0; i <3 ; i++)
                {
                    System.out.print("Введите слово: ");
                    //usrWord = read.readLine();
                    usrWord=scan.next();
                    if (usrWord.equals(rndWord))
                    {
                        System.out.println("Поздравляем " + rndWord + " верное слово");
                        break;
                    }

                    else
                    {
                        for (int j = 0; j < rndWord.length() ; j++)
                        {
                            for (int k = 0; k < usrWord.length() ; k++)
                            {
                                if(rndWord.charAt(j)==usrWord.charAt(k))disp[j]=rndWord.charAt(j);
                                else;
                            }
                        }
                        System.out.println("Совпадают буквы: "+Arrays.toString(disp)+"\n");
                    }
                }
                System.out.println("Для продолжения нажмите -1, Для выхода -0");
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
