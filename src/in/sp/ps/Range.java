package in.sp.ps;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Range Number :");
        int low = obj.nextInt();
        int higher = obj.nextInt();
        int num = obj.nextInt();
        if (low<=num && higher>=num){
            System.out.println("The Given Number is Within Range");
        }else{
            System.out.println("The Given Number is Not Within the Range");
        }
    }
}
