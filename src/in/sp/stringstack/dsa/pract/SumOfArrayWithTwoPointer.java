package in.sp.stringstack.dsa.pract;

public class SumOfArrayWithTwoPointer {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        while (start <= end) {
            if (start != end) {
                sum = sum + arr[start] + arr[end];
            } else {
                sum = sum + arr[start];
            }
            start++;
            end--;
        }
        System.out.print(sum);
    }
}
