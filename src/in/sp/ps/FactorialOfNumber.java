package in.sp.ps;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
