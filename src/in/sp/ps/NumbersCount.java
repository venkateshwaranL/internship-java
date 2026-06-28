package in.sp.ps;

import java.util.Scanner;

public class NumbersCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int count = 0;
        if (num == 0){
            count=1;
        }else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
