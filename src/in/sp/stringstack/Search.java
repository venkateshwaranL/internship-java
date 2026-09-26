package in.sp.stringstack;

import in.sp.dsa.ArraysTask;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int key = obj.nextInt();
        ArraysTask ar = new ArraysTask();
        int Search = ar.binarySearch(key, arr);
        System.out.println(Search);
        obj.close();
    }
}
