package in.sp.arrays;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = {28,11,9,10,24};
        System.out.println("Im Printing arr"+ Arrays.toString(arr));
        int [] arr2 = new int[5];
        System.out.println("Print the arr2 "+Arrays.toString(arr2));
            Arrays.fill(arr2,-1);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr == arr2);
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);
        Arrays.sort(arr);
        System.out.println("After Sorting the Array 1"+Arrays.toString(arr));
        int [] arr3 = Arrays.copyOf(arr,arr.length);
        System.out.println("Copy of Arrays" +Arrays.toString(arr3));
    }
}
