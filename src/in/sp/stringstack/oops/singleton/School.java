package in.sp.stringstack.oops.singleton;

public class School {
    public static void main(String[] args) {
       Teacher obj = Teacher.getObject(0,null,null);
        System.out.println(obj);
        Teacher obj1 = Teacher.getObject(0,null,null);
        System.out.println(obj1);
    }
}
