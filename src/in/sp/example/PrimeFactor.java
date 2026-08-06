package in.sp.example;

import java.util.LinkedList;
import java.util.Scanner;

public class PrimeFactor {
    public static LinkedList<Integer> allPrime(int num){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i= 2;i*i <= num;i++){
            if(num%i==0){
                ans.add(i);
                while(num%i==0){
                   num/=i;
                }
            }
        }
        if(num > 1){
            ans.add(num);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        LinkedList<Integer> primeFactor = allPrime(num);
        System.out.println("Unique Prime Factor");
        for (int res : primeFactor){
            System.out.print(res+" ");
        }
        System.out.println();
    }
}
