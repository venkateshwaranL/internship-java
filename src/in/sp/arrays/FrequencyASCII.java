package in.sp.arrays;

import java.util.Scanner;

public class FrequencyASCII {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = obj.nextLine();
        int[] frequency = new int[256];

        for(int i=0;i<name.length();i++){
            frequency[name.charAt(i)]++;
        }
        for(int i = 0;i<256;i++){
            if (frequency[i]>0){
                System.out.println( (char) i+" = "+frequency[i]);
            }
        }
        obj.close();
    }
}
