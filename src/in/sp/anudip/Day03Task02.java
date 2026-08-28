package in.sp.anudip;

import java.util.Scanner;

public class Day03Task02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int num = obj.nextInt();
        int[] arrayNum = new int[num];
        for(int i = 0;i<arrayNum.length;i++){
            System.out.println("Enter the "+i+" value :");
            arrayNum[i]=obj.nextInt();
        }
        int arrayLargestNumber = 0;
        for (int i=0;i<arrayNum.length;i++){
            if(arrayNum[i]>arrayLargestNumber){
                arrayLargestNumber = arrayNum[i];
            }
        }
        System.out.println("The Largest Number in the Array is: "+arrayLargestNumber);
    }
}
