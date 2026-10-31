package in.sp.arrays;

import java.util.Scanner;

public class ArraySwape {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int[] arr = new int[obj.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=obj.nextInt();
        }
        System.out.println("Array are");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!= arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
        Swape sp = new Swape();
        sp.swapeNumber(arr,2,3);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!= arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
