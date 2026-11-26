package in.sp.stringstack.oops.interfaceprogram;


interface Calculator {
    void add();
}

class Calculator1 implements Calculator {
    @Override
     public void add() {
        System.out.println(10 + 5);
    }
}

class Calculator2 implements Calculator {
    @Override
    public void add() {
        System.out.println(15 + 7);
    }
}

class Calculator3 implements Calculator {
    @Override
    public void add() {
        System.out.println(20 + 6);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        Calculator2 c2 = new Calculator2();
        Calculator3 c3 = new Calculator3();
        c1.add();
        c2.add();
        c3.add();
        Calculator ref = new Calculator1();
        ref.add();
        new Calculator2().add();
        new Calculator3().add();
    }
}
