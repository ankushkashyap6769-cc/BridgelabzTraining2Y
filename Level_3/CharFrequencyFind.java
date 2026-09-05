package String.Level_3;
import java.util.Scanner;
public class CharFrequencyFind {
    public static String[][] getCharacterFrequencies(String str) {
        int[] frequency = new int[256];

        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[][] frequencyData = getCharacterFrequencies(userInput);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < frequencyData.length; i++) {
            String character = frequencyData[i][0];
            String freq = frequencyData[i][1];

            if (character.equals(" ")) {
                character = "[Space]";
            }

            System.out.println(character + "\t\t" + freq);
        }
    }
}
