package in.sp.ps;

import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Number 1 :");
        a=obj.nextInt();
        System.out.println("Enter the Number 2 :");
        b=obj.nextInt();
        System.out.println("Enter the Number 3 :");
        c=obj.nextInt();
        if (a>b && a>c){
            System.out.println("A is the Greatest Number :"+a);
        } else if (b>a && b>c) {
            System.out.println("B is the Greatest Number :"+b);
        }else {
            System.out.println("C is the Greatest Number :"+c);
        }
    }
}