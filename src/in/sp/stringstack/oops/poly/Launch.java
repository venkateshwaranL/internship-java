package in.sp.stringstack.oops.poly;

class Animal {
    void ownerComeHome() {
        System.out.println("Welcome Owner");
    }
}

class Dog extends Animal {
    @Override
    void ownerComeHome() {
        System.out.println("Dog Welcome Owner");
    }
    void fetchBall(){
        System.out.println("Dog Play Ball");
    }
}

class Cat extends Animal {
    @Override
    void ownerComeHome() {
        System.out.println("Cat Welcome Owner");
    }
    void scratchSofa(){
        System.out.println("Cat Play with Sofa");
    }
}

class Parrot extends Animal {
    @Override
    void ownerComeHome() {
        System.out.println("Parrot Welcome Owner");
    }
    void playWords(){
        System.out.println("Parrot Play Words");
    }
}

public class Launch {
    public static void main(String[] args) {

        //Loose Coupling
        Animal ref;
        ref=new Dog();
        ref.ownerComeHome();
        ((Dog)(ref)).fetchBall();//Downcasting
        ref=new Cat();
        ref.ownerComeHome();
        ((Cat)(ref)).scratchSofa();//Downcasting
        ref=new Parrot();
        ref.ownerComeHome();
        ((Parrot)(ref)).playWords();//Downcasting



        //Tightly Coupling
//        Dog d = new Dog();
//        Cat c = new Cat();
//        Parrot p = new Parrot();
//        d.ownerComeHome();
//        c.ownerComeHome();
//        p.ownerComeHome();
    }
}
