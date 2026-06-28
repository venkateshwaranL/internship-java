package in.sp.ps;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int temp = num;
        int res = 0;
        while (num >0){
            res = res * 10;
            res = res + (num%10);
            num = num/10;
        }
        System.out.println(res);
        if (res == temp){
            System.out.println("The Given Number is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
