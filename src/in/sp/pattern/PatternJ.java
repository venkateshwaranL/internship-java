package in.sp.pattern;

public class PatternJ {
    public static void main(String[] args) {
        int num = 5;
        for(int row=1;row<= num * 2 -1;row++){
            int rowChange = row > num ? (num*2)-row : row;
            for(int col=1;col<=rowChange;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int row=1;row<=num;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int row2=4;row2>=1;row2--){
//            for(int col2=1;col2<=row2;col2++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
