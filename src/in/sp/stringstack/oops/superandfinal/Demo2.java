package in.sp.stringstack.oops.superandfinal;

public class Demo2 extends Demo1{
    int a = 50;
    int b = 30;
    @Override
    void display(){
        super.display();
        System.out.println("This method from demo2 from child");
        System.out.println(a+" "+b);
        System.out.println(super.a);
    }
}
