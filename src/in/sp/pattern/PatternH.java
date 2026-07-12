package in.sp.pattern;

public class PatternH {
    public static void main(String[] args) {
        int num = 5;
        for(int row=5;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
