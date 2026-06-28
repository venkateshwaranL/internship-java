package in.sp.character;

import java.util.Scanner;

public class CharFounder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Character :");
        char value = obj.next().charAt(0);
        if ((value >= 'A' && value <= 'Z') ||(value >= 'a' && value <= 'z')){
            System.out.println("Alphabet");
        } else if (value >= '0' && value <= '9') {
            System.out.println("Number");
        }else {
            System.out.println("Special Character");
        }
    }
}
