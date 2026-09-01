package Arrays.Level_2;

import java.util.Scanner;

public class MarksPerchantage {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double physics = scanner.nextDouble();
            double chemistry = scanner.nextDouble();
            double maths = scanner.nextDouble();

            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid input. Marks must be positive. Enter again:");
                i--;
            } else {
                marks[i][0] = physics;
                marks[i][1] = chemistry;
                marks[i][2] = maths;
            }
        }

        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] + ", Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
        }
    }
}
