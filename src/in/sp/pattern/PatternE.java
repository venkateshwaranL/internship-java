package in.sp.pattern;

public class PatternE {
    public static void main(String[] args) {
        int num = 5;
        int printValue;
        for (int row = 1; row <= num; row++) {
            printValue = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(printValue+" ");
                printValue = printValue == 0 ? 1:0;
            }
            System.out.println();
        }
    }
}

