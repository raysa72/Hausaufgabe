package Package3;

import java.util.Random;

public class Main
{
    public static void main(String[]args) {
        // Напишите программу, которая получает от пользователя два целых числа
        // и затем вычисляет сумму (сложение), разницу (вычитание),
        // произведение (умножение) и частное (деление) введённых чисел.
        // Результат вычислений выведите в консоль.

        int myArg1 = Integer.parseInt(args[0]);
        int myArg2 = Integer.parseInt(args[1]);
        //myStr = String.valueOf("Raisa ist die Beste");
        double result;

        result = myArg1 + myArg2;
        System.out.println("" + myArg1 + "плюс" + myArg2 + "равно" + (int) result);

        result = myArg1 - myArg2;
        System.out.println("От уменьшаемого " + myArg1 + " отнимаем вычитаемое " + myArg2 + " получаем разность " + (int) result);
        if (myArg2 == 0) {
            System.out.println("Dividieren auf 0 ist nicht zulässig");
        } else {
            result = myArg1 / myArg2;
            System.out.println("Dividieren von " + myArg1 + " und " + myArg2 + " ist " + result);

        }
    }
}
