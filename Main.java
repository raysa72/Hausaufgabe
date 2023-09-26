package Package4;

import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //short num1 = 30 ; short num2 = 10 ;


        /*int res1 = num1 + num2 ;
        int res2  = num1 - num2 ;
        int res3  = num1 * num2 ;
        int res4 = num1 / num2 ;
        System.out.println(" Результат :" + res1);
        System.out.println(" Результат :" + res2 );
        System.out.println(" Результат :" + res3 );
        System.out.println(" Результат :" + res4 );*/


        System.out.println("Введите первое число");
        float num1 = scan.nextFloat();

        System.out.println("Введите второе число");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2 ;
        float res2 = num1 - num2 ;
        float res3 = num1 * num2 ;
        float res4 = num1 / num2 ;
        float res5 = num1 % num2 ;



        //System.out.println("Результат : + res1");
        System.out.println(  res1 + "/n" + res2 + "/n" +res3 + "/n" +res4 + "/n" + res5 + "/n");
        //System.out.println("Результат  : - res2");
        //System.out.println("Результат  : *  res3");
        //System.out.println("Результат  : /  res4");
        //System.out.println("Результат  : %  res5");


    }
}
