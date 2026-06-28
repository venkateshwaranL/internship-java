package in.sp.ps;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the tables Number");
        int num = obj.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+i*num);
        }
    }
}
