package in.sp.stringstack;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int[] arr = new int[obj.nextInt()];
        System.out.println("Enter the Array Element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.print("[");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            if(i!= arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("Enter the Key value:");
        int key = obj.nextInt();
        for(int i=0;i< arr.length;i++){
            if (key==arr[i]){
                System.out.println("Key value "+key+" Found at "+i+" Index");
                System.exit(1);
            }
        }
        System.out.println("Key Not Found");
        obj.close();
    }
}
