package in.sp.character;

import java.util.Scanner;

public class CaseToCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Character");
        char value = obj.next().charAt(0);
//        int newValue =0;
        if ('A' <= value && 'Z' >= value){
//           newValue = value+32;
             value+=32;
        } else if ('a' <= value && 'z' >= value) {
//           newValue = value-32;
            value-=32;
        }else {
            System.out.println("Not a Letter");
        }
        System.out.println(value);
//        char res = (char)newValue;
//        System.out.println(res);
        /*Use the Comment code for Better Understand*/
    }
}
