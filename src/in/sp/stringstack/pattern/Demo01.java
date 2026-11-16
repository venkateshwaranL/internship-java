package in.sp.stringstack.pattern;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                char res = (char) j;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
