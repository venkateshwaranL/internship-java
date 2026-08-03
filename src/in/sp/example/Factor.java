package in.sp.example;

public class Factor {
    public static void main(String[] args) {
        int num = 36;
        int i;
        for(i = 1;i*i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        for(i=i-1;i >=1;i--){
            if(num%i==0 && i != (num/i)){
                System.out.print((num / i)+" ");
            }
        }
    }
}
