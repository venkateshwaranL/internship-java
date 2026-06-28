package in.sp.ps;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = obj.nextInt();
        int count = 0;
        for(int i =1; i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" Not a Prime Number");
        }
    }
}
