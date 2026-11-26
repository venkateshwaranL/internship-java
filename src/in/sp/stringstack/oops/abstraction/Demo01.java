package in.sp.stringstack.oops.abstraction;

abstract class Bird{
    abstract void fly();
}

class Ostrich extends Bird{
    @Override
    void fly() {
        System.out.println("I Don't Fly");
    }
}

class Eagle extends Bird{
    @Override
    void fly() {
        System.out.println("I Fly");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        Ostrich bird = new Ostrich();
        bird.fly();
    }
}
