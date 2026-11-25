package in.sp.stringstack.oops.poly;

class Calculator {
    //Methodoverloading
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, float b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Launch3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5, 5);
    }
}
