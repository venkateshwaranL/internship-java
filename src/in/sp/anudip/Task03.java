package in.sp.anudip;

public class Task03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Before A : "+a+" B : "+b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Before A : "+a+" B : "+b);
    }
}
