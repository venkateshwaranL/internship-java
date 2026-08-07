package in.sp.example;

import java.util.LinkedList;

public class UniquePrimeFactor {
    public static LinkedList<Integer> isUniquePrimeFactor(int num){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i=2;i*i<=num;i=(i==2?i+1:i+2)){
            if(num%i==0){
                ans.add(i);
                while(num%i==0)
                    num = num / i;
            }
        }
        if(num>2){
            ans.add(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 120;
        LinkedList<Integer> uniquePrimeFactor = isUniquePrimeFactor(num);
        for(int upf : uniquePrimeFactor){
            System.out.print(upf+" ");
        }
    }
}
