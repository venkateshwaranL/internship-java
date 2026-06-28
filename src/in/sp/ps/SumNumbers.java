package in.sp.ps;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = obj.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Number is :"+sum);
    }
}
