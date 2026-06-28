package in.sp.character;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char value = obj.next().charAt(0);
        int asciiValue = value;
        System.out.println(asciiValue);
    }
}
