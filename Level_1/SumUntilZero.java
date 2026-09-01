package Arrays.Level_1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) {
                break;
            }
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total: " + total);

    }
}
