package in.sp.stringstack.dsa.pract;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
//        int sum=0;
//        for(int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        while (i <= j) {
            if (i != j) {
                sum = sum + arr[i];
                sum = sum + arr[j];
            }else{
                sum=sum+arr[i];
            }

            i++;
            j--;
        }
        System.out.println(sum);
    }
}
