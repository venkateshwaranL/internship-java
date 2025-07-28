import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numGrades = scan.nextInt();
        double[] grades = new double[numGrades];
        double sum = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = scan.nextDouble();
            sum += grades[i];
        }
        double average = sum / numGrades;
        System.out.println("\nAverage grade: " + average);
        scan.close();
    }
}
