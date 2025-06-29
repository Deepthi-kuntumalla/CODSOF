import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average percentage
    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    // Method to determine grade based on average
    public static String getGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        // Taking input for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        // Calculations
        int totalMarks = calculateTotal(marks);
        double average = calculateAverage(totalMarks, numSubjects);
        String grade = getGrade(average);

        // Displaying results
        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks      : " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade            : " + grade);

        scanner.close();
    }
}
