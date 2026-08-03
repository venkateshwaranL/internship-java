package in.sp.example;

public class ResverseNumber {
    public static void main(String[] args) {
        int num = 1441;
        int res = 0;
        int temp = num;
        while(num > 0){
            int digit = num % 10;
            res =(res * 10) + digit;
            num = num / 10;
        }
        if(temp ==res){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
