package in.sp.stringstack.oops.consts;

public class FanApp {
    public static void main(String[] args) {
        Fan f1=new Fan();
        System.out.println("Fan Brand: " + f1.brand + " color :" + f1.color + " Wings :" + f1.no_ofWings + " cost:" + f1.cost);
        Fan f2=new Fan(2);
        System.out.println("Fan Brand: " + f2.brand + " color :" + f2.color + " Wings :" + f2.no_ofWings + " cost:" + f2.cost);
        Fan f3 = new Fan(3,"Tata");
        System.out.println("Fan Brand: " + f3.brand + " color :" + f3.color + " Wings :" + f3.no_ofWings + " cost:" + f3.cost);
        Fan f4=new Fan(4,"Oppo",4000);
        System.out.println("Fan Brand: " + f4.brand + " color :" + f4.color + " Wings :" + f4.no_ofWings + " cost:" + f4.cost);
        Fan f5=new Fan(3,"Vivo",3000,"White");
        System.out.println("Fan Brand: " + f5.brand + " color :" + f5.color + " Wings :" + f5.no_ofWings + " cost:" + f5.cost);
    }
}
