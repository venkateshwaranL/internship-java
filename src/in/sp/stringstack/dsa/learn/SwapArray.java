package in.sp.stringstack.dsa.learn;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        Demo1 d =new Demo1();
        d.swapValue(arr,0,3);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
