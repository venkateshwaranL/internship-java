package in.sp.stringstack;

public class BankCustomer {
    int id;
    int accountNo;
    String password;
    String emailId;
    long balance;

    void showProfile() {
        System.out.println("Id of the Customer is: " + id + " Account Number is:" + accountNo + " Email is " + emailId + " Password is:" + password);
    }

    void showBalance() {
        System.out.println("The Balance is: " + balance);
    }
}