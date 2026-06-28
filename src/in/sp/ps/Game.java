package in.sp.ps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(10)+1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=0;
        while (num != secretNumber){
            num=obj.nextInt();
            if (num>secretNumber){
                System.out.println("The given number is high");
            } else if (num<secretNumber) {
                System.out.println("The Given number is lower");
            }
        }
        System.out.println("you won the game");
    }
}
