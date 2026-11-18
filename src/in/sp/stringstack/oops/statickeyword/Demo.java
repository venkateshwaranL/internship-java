package in.sp.stringstack.oops.statickeyword;

public class Demo {
    static int a;
    static int b;
    static {
        a = 100;
        b = 200;
    }
    static void display1(){
        System.out.println("A ->"+a);
        System.out.println("B ->"+b);
    }
    int x;
    int y;
    {
        x=1000;
        y=2000;
        a=99;
        b=999;
    }
    void display2(){
        System.out.println("X ->"+x);
        System.out.println("Y ->"+y);
        System.out.println("A ->"+a);
        System.out.println("B ->"+b);
    }
}
