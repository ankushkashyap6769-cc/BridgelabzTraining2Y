package Arrays.Level_2;

import java.util.Scanner;

public class ReverseNumber {
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

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[i];
        }

        System.out.print("Reversed number: ");
        if (number < 0) {
            System.out.print("-");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();

    }
}
