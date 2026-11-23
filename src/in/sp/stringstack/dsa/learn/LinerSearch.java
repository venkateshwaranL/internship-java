package in.sp.stringstack.dsa.learn;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Element:");
        int num = obj.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the Array Element:");
        for(int i=0;i< arr.length;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Array:");
        PrintStatementFunction.print(arr);
        System.out.println("Enter the Key Value:");
        int key = obj.nextInt();
        boolean value = false;
        for(int i=0;i< arr.length;i++){
            if(key==arr[i]){
//                System.out.println("Key Element Found");
                value=true;
                break;
            }
        }
        if (value){
            System.out.println("Key Element Found");
        }else {
            System.out.println("Key Element Not Found");
        }

    }
}
