package in.sp.stringstack.oops.poly;


class Pay{
    void pay(int amount){
        System.out.println("Paying Money");
    }
}

class Upi extends Pay {
    @Override
    void pay(int amount) {
        System.out.println("Payment Done using upi amount: " + amount);
    }
}

class Card extends Pay {
    @Override
    void pay(int amount) {
        System.out.println("Payment Done using Card amount: " + amount);
    }
}

class Wallet extends Pay {
    @Override
    void pay(int amount) {
        System.out.println("Payment Done using Wallet amount: " + amount);
    }
}

class NetBanking extends Pay {
    @Override
    void pay(int amount) {
        System.out.println("Payment Done using NetBanking amount: " + amount);
    }
}

class Checkout {
    void payment(Pay payment,int amount) {
        payment.pay(amount);
    }

}

public class App {
    public static void main(String[] args) {
        Upi upi = new Upi();
        Card card = new Card();
        Wallet wallet = new Wallet();
        NetBanking netBanking = new NetBanking();
        Checkout checkout = new Checkout();
        checkout.payment(card,1000);
    }
}
