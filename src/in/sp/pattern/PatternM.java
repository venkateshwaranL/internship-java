package in.sp.pattern;

public class PatternM {
    public static void main(String[] args) {
        int num = 5;
        for(int row=1;row<= num;row++){
            for (int space=1;space<=num-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
