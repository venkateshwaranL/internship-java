package in.sp.example;

import java.util.Locale;

public class CountChar {
    public static void main(String[] args) {
        String name = "Venkateshwaran".toLowerCase(Locale.ROOT);//check with toLowerCase() Method without argument , what will happen
        int[] frequency = new int[256];
        for(int i=0;i<name.length();i++){
            frequency[name.charAt(i)]++;
        }
        for(int i = 0;i<256;i++){
            if(frequency[i] > 0){
                System.out.println((char)i+" = "+frequency[i]);
            }
        }
    }
}
