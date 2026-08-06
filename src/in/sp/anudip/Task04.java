package in.sp.anudip;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = obj.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = obj.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = obj.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println();
        System.out.println("Simple Interest = " + simpleInterest);

        obj.close();
    }
}
