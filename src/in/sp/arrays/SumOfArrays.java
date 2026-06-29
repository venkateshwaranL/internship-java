package in.sp.arrays;

import java.util.Scanner;

public class SumOfArrays {

    public static int sumoOfArrays( int arr[]){
        int res = 0;
        for (int i =0;i<arr.length;i++){
            res += arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrSize = obj.nextInt();

        int arr[] = new int[arrSize];
        for (int i =0;i<arr.length;i++){
            System.out.println("Enter the Value "+i+" :");
            arr[i]=obj.nextInt();
        }
        System.out.println("The Sum of Array is : "+sumoOfArrays(arr));
    }
}
