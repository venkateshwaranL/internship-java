package in.sp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Integer rows, columns;
        Scanner obj = new Scanner(System.in);
        rows= obj.nextInt();
        columns= obj.nextInt();
        int martix [][]= new int[rows][columns];
        for(int row=0;row<rows;row++){
            for(int col=0;col<columns;col++){
                martix[row][col]=obj.nextInt();
                System.out.print(martix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
