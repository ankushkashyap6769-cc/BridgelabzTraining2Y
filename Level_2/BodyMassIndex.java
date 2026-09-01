package Arrays.Level_2;

import java.util.Scanner;

public class BodyMassIndex {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextDouble();
            height[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + height[i] + " m, Weight: " + weight[i] + " kg, BMI: " + bmi[i] + ", Status: " + status[i]);
        }

    }
}
