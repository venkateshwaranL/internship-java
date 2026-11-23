package in.sp.stringstack.dsa.learn;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        int i = 0;
        int j = arr1.length - 1;
        while (i <= j) {
            arr2[i] = arr1[i];
            arr2[j] = arr1[j];
            i++;
            j--;
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}
