package in.sp.example;

import java.util.LinkedList;
import java.util.Scanner;

public class UPF {
    public static LinkedList<Integer> isPime(int num){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i=2;i*i<=num;i++){
            if (num%i==0){
                ans.add(i);
                while(num%i==0){
                    num/=i;
                }
            }
        }if(num>1){
            ans.add(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = obj.nextInt();
        LinkedList<Integer> pime = isPime(num);
        for (int primesNumber : pime){
            System.out.print(primesNumber+" ");
        }
    }
}
