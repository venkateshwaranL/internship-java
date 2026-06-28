package in.sp.ps;

import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int res=0;
        while (num > 0){
            res = res*10;
            res = res+(num%10);
            num=num/10;
        }
        System.out.println(res);
    }
}
