package in.sp.pattern;

public class PatternL {
    public static void main(String[] args) {
        int num = 5;
        for(int row=1;row<=num;row++){
            int colTimes= num - row + 1;
            for(int space=1;space<=num - colTimes;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=colTimes;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
