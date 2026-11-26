package in.sp.stringstack.oops.abstraction;

abstract class NormalClass{
    static int a;
    static {
        System.out.println("I'm Static Block");
    }
    static void display(){
        System.out.println("Static Method within abstract class");
    }
    NormalClass(){
        System.out.println("I'm Constructor");
    }
    int b;
    {

    }
    void display2(){
        System.out.println("Non Static Method");
    }
}

class Child1 extends NormalClass{
    Child1(){
        super();
    }
}

public class Demo02 {
    public static void main(String[] args) {
        NormalClass.a=100;
        System.out.println(NormalClass.a);
        NormalClass.display();
        Child1 ch = new Child1();
        ch.b=20;
        ch.display2();
        System.out.println(ch.b);


    }
}
