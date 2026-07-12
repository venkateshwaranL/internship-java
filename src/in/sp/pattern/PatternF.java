package in.sp.pattern;

public class PatternF {
    public static void main(String[] args) {
        int num = 5;
        int printValue = 1;
        for(int row = 1;row<=num;row++){
            for(int col =1;col<=row;col++){
                System.out.print(printValue+" ");
                printValue++;
            }
            System.out.println();
        }
    }
}
