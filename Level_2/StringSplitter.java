package String.Level_2;
import java.util.Scanner;
public class StringSplitter {
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

    public static String[] customSplit(String str) {
        int strLength = getLength(str);
        if (strLength == 0) {
            return new String[0];
        }

        int spaceCount = 0;
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int spaceIndexPointer = 0;

        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceIndexPointer] = i;
                spaceIndexPointer++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        String lastWord = "";
        for (int j = start; j < strLength; j++) {
            lastWord += str.charAt(j);
        }
        words[spaceCount] = lastWord;

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        String[] customResult = customSplit(userInput);
        String[] builtInResult = userInput.split(" ");

        boolean isEqual = compareArrays(customResult, builtInResult);

        System.out.print("Custom split result: ");
        for (String word : customResult) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        System.out.print("Built-in split result: ");
        for (String word : builtInResult) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        System.out.println("Are both array results equal? " + isEqual);
    }
}
