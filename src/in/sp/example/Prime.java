package in.sp.example;

public class Prime {
    public static void main(String[] args) {
        int num = 7;
        boolean flag = true;
        if(num < 2){
            flag = false;
        }
        for (int i = 2;i*i<num;i++){
            if (num%i==0){
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
