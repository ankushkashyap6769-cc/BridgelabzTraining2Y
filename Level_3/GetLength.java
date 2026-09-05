package String.Level_3;
import java.util.Scanner;
public class GetLength {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] uniqueCharacters(String str) {
        int strLength = getLength(str);
        char[] tempUnique = new char[strLength];
        int uniqueCount = 0;

        for (int i = 0; i < strLength; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = current;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    public static String[][] getCharacterFrequencies(String str) {
        int[] frequency = new int[256];
        int length = getLength(str);

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
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
