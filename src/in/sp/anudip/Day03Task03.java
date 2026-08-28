package in.sp.anudip;

import java.util.Scanner;

public class Day03Task03 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Length:");
        int num = obj.nextInt();
        int evenCount = 0 , oddCount = 0;
        int[] arrayNumber = new int[num];
        for (int i=0;i<num;i++){
            System.out.println("Enter the "+i+" Array Value:");
            arrayNumber[i]=obj.nextInt();
        }
        for (int i =0;i<num;i++){
            if(arrayNumber[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Count of the Even Numbers : "+evenCount);
        System.out.println("Count of the Odd Numbers : "+oddCount);
    }
}
