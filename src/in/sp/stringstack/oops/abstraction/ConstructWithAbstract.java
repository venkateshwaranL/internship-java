package in.sp.stringstack.oops.abstraction;

abstract class ParentAbstract{
    ParentAbstract(){
        System.out.println("I'm Abstract Method");
    }
}

class Child extends ParentAbstract {
    Child(){
        super();
        System.out.println("I'm Child Class");
    }
}

public class ConstructWithAbstract {
    public static void main(String[] args) {
        new Child();
    }
}
