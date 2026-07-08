package in.sp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int arrSize = obj.nextInt();
        int[] array = new int[arrSize];
        for(int i =0;i<arrSize;i++){
            System.out.println("Enter the Element: ");
            array[i]=obj.nextInt();
        }
        Arrays.sort(array);
        int largestNumber = array[arrSize - 1];
        System.out.println("Largest Number is: "+largestNumber);
    }
}
