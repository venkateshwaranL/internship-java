package in.sp.stringstack;

public class Bank {
    public static void main(String[] args) {
        BankCustomer bc = new BankCustomer();
        bc.id=151;
        bc.accountNo=15234678;
        bc.emailId="Ram@gmail.com";
        bc.password="ram@123";
        bc.balance=7845L;
        bc.showProfile();
        bc.showBalance();
        BankCustomer bc1 = new BankCustomer();
        bc1.id=152;
        bc1.accountNo=15234784;
        bc1.emailId="Bala@gmail.com";
        bc1.password="bala@123";
        bc1.balance=4747L;
        bc1.showProfile();
        bc1.showBalance();
        new BankCustomer().showBalance();
    }
}
