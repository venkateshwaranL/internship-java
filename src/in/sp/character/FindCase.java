package in.sp.character;

import java.util.Scanner;

public class FindCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Character :");
        char value = obj.next().charAt(0);
        if (value >= 'A' && value <= 'Z'){
            System.out.println("The given Number is Capital");
        } else if (value >= 'a' && value <='z') {
            System.out.println("The given Number is Small");
        }else {
            System.out.println("Not a Letter");
        }
    }
}
