package in.sp.strings;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String name = obj.nextLine();
        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+" index is: "+i);
            }
        }
    }
}
