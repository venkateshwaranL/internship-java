package in.sp.pattern;

public class PatternG {
    public static void main(String[] args) {
        int num = 5;
//        for(int row=5;row>=1;row--){
//            for (int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int row =1;row<=num;row++){
            for(int col = 1;col<= num-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
