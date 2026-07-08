package in.sp.arrays;

import java.util.Scanner;

public class FrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String names = obj.nextLine();
        char[] chNames = names.toCharArray();
        boolean [] visited = new boolean[names.length()];
        for(int i=0;i<names.length();i++){
            if(visited[i]){
                continue;
            }
            int count =1;
            for(int j =i+1;j<names.length();j++){
                if(chNames[i]==chNames[j]){
                    count++;
                    visited[j]= true;
                }
            }
            System.out.println(chNames[i]+"-"+count);
        }
    }
}
