package in.sp.ps;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        if (num>=0){
            if (num == 0){
                System.out.println("Zero");
            }else {
                System.out.println("Positive Number");
            }
        }else {
            System.out.println("Negative Number");
        }
    }
}
