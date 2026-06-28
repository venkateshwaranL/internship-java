package in.sp.ps;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = obj.nextInt();
        if ((year%400 == 0)||( year%4 == 0 && year%100 != 0)){
            System.out.println("leap year "+year);
        }else{
            System.out.println("Not a leap year");
        }
    }
}
