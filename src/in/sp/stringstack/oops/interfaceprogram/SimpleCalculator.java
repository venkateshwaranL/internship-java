package in.sp.stringstack.oops.interfaceprogram;

interface CalculatorSimple{
    void addition();
    void subration();
}

abstract class FirstCalculator implements CalculatorSimple {
    @Override
    public void addition() {
        System.out.println(4+9);
    }//here we can't use the subration method
}
class InhertClass extends FirstCalculator{

    @Override
    public void subration() {

    }
}

public class SimpleCalculator {

}
