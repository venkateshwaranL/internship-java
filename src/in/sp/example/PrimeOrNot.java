package in.sp.example;

public class PrimeOrNot {
    static boolean  isPrime(int num){
        boolean flag = true;
        if(num < 2){
            flag = false;
        }
        for(int i=2;i*i <=num;i++){
            if(num%i==0){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int num = 1;
        boolean value = isPrime(num);
        System.out.println(value);
    }
}
