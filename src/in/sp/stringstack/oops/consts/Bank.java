package in.sp.stringstack.oops.consts;

public class Bank {
    int accNo;
    String name;
    final int balance;
    long phoneNo;
    String email;

    public Bank(int accNo, String name, int balance, long phoneNo, String email) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public Bank(Bank ref) {
        accNo = ref.accNo;
        name = ref.name;
        balance = ref.balance;
        phoneNo = ref.phoneNo;
        email = ref.email;
    }
    public void printDetails(){
        System.out.println("Name: "+name+" Account no: "+accNo+" Balance: "+balance+" Phone no: "+phoneNo+" Email Id: "+email);
    }
}
