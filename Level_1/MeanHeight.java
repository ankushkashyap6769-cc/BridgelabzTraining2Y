package Arrays.Level_1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("Mean height: " + mean);
    }
}
