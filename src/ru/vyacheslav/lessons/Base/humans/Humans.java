package ru.vyacheslav.lessons.Base.humans;
import java.util.Random;
public class Humans
{
    private String sureName;
    private String name;
    private String middleName;
    private String position;
    private String eMail;
    private float salary;
    private byte age;
    private Random rnd = new Random();
    public Humans(String sureName, String name, String middleName,
           String position, String eMail, float salary)
    {
        this.sureName=sureName;
        this.name=name;
        this.middleName=middleName;
        this.position=position;
        this.eMail=eMail;
        this.salary=salary;
        this.age=(byte)(18+rnd.nextInt(65-18));
    }
    public void showHuman()
    {
        System.out.println("Фамилия: "+ sureName + " Имя: "+ name +" Отчество: "+ middleName
         +" Должность: "+ position +" Электронная почта: "+ eMail +" Зароботная плата: "+ salary +" Возраст: "+ age);
    }

    public byte getAge()
    {
        return age;
    }
}
