package in.sp.stringstack.oops.statickeyword;

import java.util.Scanner;

public class BusinessMan {
    int p;
    int t;
    static float r;
    float si;

    static {
        r = 2.0f;
    }

    public void acceptData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the P & T");
        p = scan.nextInt();
        t = scan.nextInt();
    }

    public void calculateSi() {
        si = (p * t * r) / 100;
    }

    public void displaySi() {
        System.out.println("SI unit :" + si);
    }
}
