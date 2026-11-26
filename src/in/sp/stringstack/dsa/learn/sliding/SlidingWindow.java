package in.sp.stringstack.dsa.learn.sliding;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int maxSum = 0;
        int sum = 0;
        int startElement = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        maxSum = sum;
        for (int j = k; j <  arr.length; j++) {
            sum = sum + arr[j] - arr[j - k];
            if (sum > maxSum) {
                maxSum = sum;
                startElement = j-k+1;
            }
        }
        System.out.println("SubArray:");
        for(int i=startElement;i<startElement+k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("MaxSum of: " + k + " is: " + maxSum);
    }
}
