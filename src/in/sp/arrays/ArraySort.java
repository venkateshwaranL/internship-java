package in.sp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int size = obj.nextInt();
        int[] array = new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the Elements: ");
            array[i]=obj.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
