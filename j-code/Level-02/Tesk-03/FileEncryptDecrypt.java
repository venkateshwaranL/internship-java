import java.io.*;
import java.util.*;

public class FileEncryptDecrypt {

    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encrypted.append((char) (ch + shift));
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : text.toCharArray()) {
            decrypted.append((char) (ch - shift));
        }
        return decrypted.toString();
    }

    public static void processFile(String inputPath, String outputPath, boolean encryptMode, int shift) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = encryptMode ? encrypt(line, shift) : decrypt(line, shift);
                writer.write(processedLine);
                writer.newLine();
            }
            System.out.println("Operation completed. Output file: " + outputPath);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File Encryption/Decryption");
        System.out.print("Enter file path: ");
        String inputPath = scan.nextLine();

        System.out.print("Do you want to encrypt or decrypt? (e/d): ");
        String mode = scan.nextLine();

        boolean encryptMode = mode.equalsIgnoreCase("e");

        System.out.print("Enter output file path: ");
        String outputPath = scan.nextLine();

        int shift = 3; // You can customize or ask the user
        processFile(inputPath, outputPath, encryptMode, shift);

        scan.close();
    }
}
