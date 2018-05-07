package ru.vyacheslav.lessons.shildt.glava6.stack;
public class StackCreate
{
    public static void main(String[] args)
    {
        char val;
        Stack stack = new Stack(10);

        for (int i = 0; i < 5 ; i++)
        {
            val=(char)((int)'A'+i);
            stack.put(val);
        }
        stack.showStack();
        System.out.print("Извлечённые из стека символы: ");
        for (int i = 0; i <3 ; i++)
        {
            System.out.print(stack.get()+" ");
        }
        System.out.println();
        stack.showStack();

        for (int i = 0; i < 10 ; i++)
        {
            val=(char)((int)'K'+i);
            stack.put(val);
        }
        stack.showStack();
    }
}
