import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = getStudentScore(scanner); // Get the student's score
        String grade = calculateGrade(score); // Calculate the grade

        System.out.println("Your Grade is: " + grade); // Display the grade
        scanner.close();
    }

    // Method 1: getStudentScore()
    public static int getStudentScore(Scanner scanner) {
        System.out.print("Enter your score: ");
        return scanner.nextInt(); // Assuming integer scores
    }

    // Method 2: calculateGrade(score)
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}