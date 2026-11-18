package in.sp.stringstack.oops.statickeyword;

import java.util.Scanner;

public class BusinessMan {
    int p;
    int t;
    float r;
    float si;

    public void acceptData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the P & T");
        p = scan.nextInt();
        t = scan.nextInt();
        r = 2.0f;
    }

    public void calculateSi() {
        si = (p * t * r) / 100;
    }

    public void displaySi() {
        System.out.println("SI unit :" + si);
    }
}
