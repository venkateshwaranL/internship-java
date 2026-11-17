package in.sp.stringstack.oops.consts;

public class Company {
    public static void main(String[] args) {
        User user = new User();
        User user_v1 = new User("RA2432241010159");
        User user_v2 = new User("RA2432241010159", "Venkateshwaran");
        User user_v3 = new User("RA2432241010159", "Venkateshwaran", 24);
        User user_v4 = new User("RA2432241010159", "Venkateshwaran", 24, "lvenkateshwaran9@gmail.com");
        User user_v5 = new User("RA2432241010159", "Venkateshwaran", 24, "lvenkateshwaran9@gmail.com", 8531025448l);
        User user_v6 = new User("RA2432241010159", "Venkateshwaran", 24, "lvenkateshwaran9@gmail.com", 8531025448l, "Java Developer");

        user.userDetails();

        user_v1.userDetails();

        user_v2.userDetails();
        user_v3.userDetails();
        user_v4.userDetails();
        user_v5.userDetails();
        user_v6.userDetails();

    }
}
