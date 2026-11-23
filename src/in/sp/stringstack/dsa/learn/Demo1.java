package in.sp.stringstack.dsa.learn;

public class Demo1 {
   static void swapValue(int[] arr ,int value1, int value2) {
        int temp ;
        temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}
