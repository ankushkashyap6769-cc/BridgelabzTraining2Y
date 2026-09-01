package Arrays.Level_2;

import java.util.Scanner;

public class FIndFrequency {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int temp = Math.abs(number);
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];
        temp = Math.abs(number);

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " frequency: " + frequency[i]);
            }
        }
    }
}
