package in.sp.arrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
//        int [] arr = {3,4,5,2,1};
//        int tar = 4;
//        boolean res = false;
//        for(int i = 0;i<arr.length;i++){
//            if(tar==arr[i]){
//             res=true;
//            }
//        }
//        if (res){
//            System.out.println("Element Founded");
//        }else{
//            System.out.println("Not Founded");
//        }
        Scanner obj = new Scanner(System.in);
        boolean res =false;
        System.out.println("Enter the array size :");
        int size = obj.nextInt();
        int arrLength[] = new int[size];
        System.out.println("Enter the Target value :");
        int tar = obj.nextInt();
        for (int i = 0; i<arrLength.length;i++){
            System.out.println("Enter the value "+i+" :");
            arrLength[i] = obj.nextInt();
        }
        for(int arrList:arrLength){
            System.out.print(arrList+" ");
        }
        System.out.println();
        for (int i =0;i<arrLength.length;i++){
            if (tar==arrLength[i]){
                res = true;
            }
        }
        if (res){
            System.out.println("Element Founded");
        }else{
            System.out.println("Not Founded");
        }
    }
}
