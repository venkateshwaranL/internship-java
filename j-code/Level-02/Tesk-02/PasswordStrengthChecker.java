import java.util.*;
public class PasswordStrengthChecker {
    public static String checkPasswordStrength(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        int length = password.length();

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                hasSpecial = true;
        }
        int score = 0;
        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        if (score <= 2) {
            return "Weak password";
        } else if (score == 3 || score == 4) {
            return "Moderate password";
        } else {
            return "Strong password";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        String result = checkPasswordStrength(password);
        System.out.println("Password strength: " + result);

        scan.close();
    }
}