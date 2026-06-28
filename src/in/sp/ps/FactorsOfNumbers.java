package in.sp.ps;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
