package in.sp.arrays;

import java.util.Locale;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = obj.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if(Character.isLetter(ch)){
                if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
