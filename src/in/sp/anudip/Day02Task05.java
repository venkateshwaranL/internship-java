package in.sp.anudip;

import java.util.Scanner;

public class Day02Task05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int sum = 0;
        int i=1;
        do{
            sum+=i;
            i++;

        }while(i<=num);
        System.out.println("Sum of the Digit is "+num+" : "+sum);
    }
}
