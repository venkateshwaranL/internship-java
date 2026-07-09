package in.sp.arrays;

import java.util.Scanner;

public class TwoPointerPalindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = obj.nextLine();
        boolean flag = true;
        int size = name.length();
        int first = 0;
        int last = size-1;
        while(first < last){
            if(name.charAt(first)!= name.charAt(last)){
                flag = false;
                break;
            }
            first++;
            last--;
        }
        System.out.println(flag);
    }
}
