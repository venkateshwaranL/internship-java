package in.sp.anudip;

import java.util.Scanner;

public class Day02Task01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number 01 :");
        int num1 = obj.nextInt();
        System.out.println("Enter the Number 02 :");
        int num2 = obj.nextInt();
        System.out.println("Enter the Number 03 :");
        int num3 = obj.nextInt();
        if (num1==num2 || num2==num3){
            System.out.println("Please Enter the Different Number");
        }
        else if(num1>num2 && num1>num3){
            System.out.println("Number "+num1+" is Largest Number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number "+num2+" is Largest Number");
        }else {
            System.out.println("Number "+num3+" is Largest Number");
        }
    }
}
