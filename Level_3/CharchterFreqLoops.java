package String.Level_3;
import java.util.Scanner;
public class CharchterFreqLoops {
    public static String[] getCharacterFrequencies(String str) {
        char[] characters = str.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];

        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (characters[i] != '0' && characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " -> " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[] frequencyData = getCharacterFrequencies(userInput);

        System.out.println("\nCharacter Frequencies:");
        System.out.println("----------------------");

        for (int i = 0; i < frequencyData.length; i++) {
            String entry = frequencyData[i];
            if (entry.startsWith(" ")) {
                entry = "[Space]" + entry.substring(1);
            }
            System.out.println(entry);
        }
    }
}
