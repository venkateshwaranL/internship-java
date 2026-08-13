package in.sp.example;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = obj.nextInt();
        int i;
        for(i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        for(i=i-1;i>=1;i--){
            if(num%i==0 && i!=(num/i)){
                System.out.print(num/i+" ");
            }
        }
    }
}
