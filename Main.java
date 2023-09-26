package Package1;

import java.util.Random;

public class Main
{
    public static void main(String[]args)

        {
            // Напишите программу, в которой объявите переменные бцех примитивных типов.
            // Значение для каждой переменной сгенерируйте с помощью класса Random .
            // При необходимости используйте приведение типов. Полученные значения
            // выведите в консоль.
            // В этой же программе создайте переменную типа String.Сгенерируйте значение для
            // строки. При необходимости используйте метод String.valueOf().Ограниченийй на
            // длину строки и содержимое нет.Полученное значение выведите в консоль.

            char a = 'G';
            Random myRand = new Random();
            int myInt = myRand.nextInt();
            byte myByte = 4;   // -128 -127
            myByte = (byte)myRand.nextInt();
            short myShort = 56;
            myShort = (short) myRand.nextInt();
            float myFloat = 4.7333436f;
            myFloat = myRand.nextFloat();
            double myDouble = 4.355453532;
            myDouble = myRand.nextDouble();
            long myLong = 12121L;
            myLong = myRand.nextLong();
            boolean b = true;
            b = myRand.nextBoolean();
            String myStr = "Raissa ist die Beste!";
            //myStr = String.valueOf("Raisa ist die Beste");

            System.out.println(myInt);
            System.out.println(a);
            System.out.println(myByte);
            System.out.println(myShort);
            System.out.println(myFloat);
            System.out.println(myDouble);
            System.out.println(myLong);
            System.out.println(b);
            System.out.println(myStr);

        }
    }

