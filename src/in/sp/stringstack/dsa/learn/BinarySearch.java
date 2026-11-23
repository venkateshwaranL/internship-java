package in.sp.stringstack.dsa.learn;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int low = 0;
        int hight = arr.length-1;
        int key = 20;
        while(low<=hight){
            int mid = (low+hight)/2;
            if(arr[mid]==key){
                System.out.println("Key Found at "+mid+" index");
                System.exit(1);
            }else if (key>arr[mid]){
                low = mid+1;
            }else{
                hight = mid -1;
            }
        }
        System.out.println("Key Not Found");
    }
}
