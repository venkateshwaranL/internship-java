package in.sp.ps;

import java.util.Scanner;

public class AddTwo {
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner obj = new Scanner(System.in);
        num1=obj.nextInt();
        num2=obj.nextInt();
        sum=add(num1,num2);
        System.out.println("Sum of two Numbers "+sum);
        int num3,num4;
        num3=obj.nextInt();
        num4=obj.nextInt();
        sum=add(num3,num4);
        System.out.println(sum);
    }
}
