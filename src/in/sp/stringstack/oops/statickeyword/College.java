package in.sp.stringstack.oops.statickeyword;

public class College {
    static int count = 0;

    {
        count++;
    }

     static void display() {
        System.out.println("Object count: " + count);
    }
}
