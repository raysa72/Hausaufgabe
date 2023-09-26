package Package2;

import java.util.Scanner;

public class Main
     {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println(" Введите свой возрост ");
             int num1 = sc.nextInt();

             System.out.println(" Введите свой вес");
             int num2 = sc.nextInt();

             String result = " Уважаемая(ый) Госпожа(дин) , в свои " + num1 + " лет Вы для нас дороги как " + num2 +  " килограмм Золота! ";
             System.out.println(result);
         }
}
