package in.sp.stringstack.oops.abstraction;

interface Calculator {
    public void add();

    public void sub();
}

class MyCalculator1 implements Calculator {
    @Override
    public void add() {
        System.out.println(5 + 7);
    }

    @Override
    public void sub() {
        System.out.println(7 - 5);
    }
}

class MyCalculator2 implements Calculator {
    @Override
    public void sub() {
        System.out.println(12 - 2);
    }

    @Override
    public void add() {
        System.out.println(12 + 2);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        MyCalculator1 mc1 = new MyCalculator1();
        mc1.add();
        mc1.sub();
        MyCalculator2 mc2 = new MyCalculator2();
        mc2.add();
        mc2.sub();
    }
}
