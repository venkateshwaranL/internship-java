package in.sp.anudip;

import java.util.Scanner;

public class Day02Task02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number 01");
        int num1 = obj.nextInt();
        System.out.println("Enter the Number 02");
        int num2 = obj.nextInt();
        System.out.println("Enter the Operation Symbol :");
        char operation = obj.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
        }
   }
}
