package in.sp.ps;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Char :");
        char word = obj.next().charAt(0);
        if ('0'<=word && '9'>=word){
            System.out.println("Number");
        } else if ('A'<=word && 'Z'>=word) {
            System.out.println("Capital Latter");
        }else if('a' <=word && 'z'>=word){
            System.out.println("Small Letter");
        }else {
            System.out.println("Special Words");
        }
    }
}
