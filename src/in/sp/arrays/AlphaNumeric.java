package in.sp.arrays;

import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        String name = obj.nextLine();
        for(int i =0;i<name.length();i++){
            char ch = name.charAt(i);
            /* use this one also
            if(Character.isDigit(ch)){
            sum = sum + Character.getNumericValue(ch);
             */
            if('0'<= ch && ch<='9'){
                sum+=(ch -'0' );
            }
        }
        System.out.println(sum);
    }
}
