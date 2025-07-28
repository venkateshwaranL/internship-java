import java.util.*;
public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_=+<>?/";
        StringBuilder charPool = new StringBuilder();
        System.out.print("Enter desired password length: ");
        int length = scan.nextInt();
        scan.nextLine();
        System.out.print("Include numbers? (yes/no): ");
        if (scan.nextLine().equalsIgnoreCase("yes")) {
            charPool.append(numbers);
        }
        System.out.print("Include lowercase letters? (yes/no): ");
        if (scan.nextLine().equalsIgnoreCase("yes")) {
            charPool.append(lowerCase);
        }
        System.out.print("Include uppercase letters? (yes/no): ");
        if (scan.nextLine().equalsIgnoreCase("yes")) {
            charPool.append(upperCase);
        }
        System.out.print("Include special characters? (yes/no): ");
        if (scan.nextLine().equalsIgnoreCase("yes")) {
            charPool.append(specialChars);
        }
        if (charPool.length() == 0) {
            System.out.println("You must select at least one character type.");
            return;
        }
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }
        System.out.println("\nGenerated Password: " + password.toString());
        scan.close();
    }
}
