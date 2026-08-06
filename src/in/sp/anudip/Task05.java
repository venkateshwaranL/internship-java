package in.sp.anudip;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        double radius = obj.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        obj.close();
    }
}
