package in.sp.stringstack.oops.singleton;

public class Assembly {
    public static void main(String[] args) {
//        President obj1 = new President();
        President obj2 = President.getObject(5, "Venkatesh", 20);
        System.out.println(obj2);
        System.out.println(obj2.name + " " + obj2.term + " " + obj2.number);
        President obj1 = President.getObject(0, null, 0);
        System.out.println(obj1);
        System.out.println(obj1.name + " " + obj1.term + " " + obj1.number);
    }
}
