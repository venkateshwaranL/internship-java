package in.sp.stringstack.oops.poly;

class Parent {
    void method1() {
        System.out.println("Hii");
    }

    void method2() {
        System.out.println("Hello");
    }

    void method3() {
        System.out.println("How are you!");
    }
}

class Child extends Parent {
    @Override
    void method1() {
        System.out.println("Hii How are you!");
    }

    void method4() {
        System.out.println("Hello Student");
    }
}

public class Launch2 {
    public static void main(String[] args) {
        Parent ref;
        Child c = new Child();
        ref=c;
        ref.method1();
        ref.method2();
        ref.method3();
        ((Child)(ref)).method4();//DownCasting
    }
}
