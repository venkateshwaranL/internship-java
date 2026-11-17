package in.sp.stringstack.oops.consts;

public class Fan {
    int no_ofWings;
    String brand;
    String color;
    int cost;

    public Fan() {
        System.out.println("Fan Object Created");
    }

    public Fan(int a) {
        no_ofWings = a;
    }

    public Fan(int a, String b) {
        no_ofWings = a;
        brand = b;
    }

    public Fan(int a, String b, int c) {
        no_ofWings = a;
        brand = b;
        cost = c;
    }

    public Fan(int a, String b, int c, String d) {
        no_ofWings = a;
        brand = b;
        cost = c;
        color = d;
    }
}
