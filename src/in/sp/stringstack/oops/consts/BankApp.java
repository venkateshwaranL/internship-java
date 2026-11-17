package in.sp.stringstack.oops.consts;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Enter the Details");
        System.out.println("1. Account No");
        System.out.println("2. Name");
        System.out.println("3. Balance");
        System.out.println("4. Phone No");
        System.out.println("5. Email Id");

        Scanner sc = new Scanner(System.in);
        Bank cu1 = new Bank(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextLong(), sc.next());
        Bank copyConst = new Bank(cu1);//copy constructor must after the copy ref created
        cu1.printDetails();
        System.out.println("----------------------");
        cu1.accNo = 5454;
        cu1.name = "Saranya";
        cu1.printDetails();
        System.out.println("old date");
        copyConst.printDetails();

    }
}
