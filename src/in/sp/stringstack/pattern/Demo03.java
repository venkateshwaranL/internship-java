package in.sp.stringstack.pattern;

public class Demo03 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if (((i + j == num)&&(i<=5))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
