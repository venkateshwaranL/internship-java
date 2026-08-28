package in.sp.anudip;

import java.util.Scanner;

public class Day03Task01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Length of the Array:");
        int num = obj.nextInt();
        int[] arrayNum = new int[num];
        for(int i =0;i<num;i++){
            System.out.println("Enter the "+i+" array value:");
            arrayNum[i]=obj.nextInt();
        }
        System.out.println("Value of the Arrays With"+num+" index:");
        for(int i=0;i<num;i++){
            System.out.print(arrayNum[i]+" ");
        }
    }
}
