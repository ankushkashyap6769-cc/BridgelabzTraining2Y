package String.Level_2;
import java.util.Scanner;
public class WordLengthAnalyze {
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

    public static String[] splitText(String str) {
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

    public static String[][] getWordsWithLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            int len = getLength(words[i]);
            wordLengthArray[i][1] = String.valueOf(len);
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        String[] words = splitText(userInput);
        String[][] wordLengthData = getWordsWithLength(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");

        for (int i = 0; i < wordLengthData.length; i++) {
            String word = wordLengthData[i][0];
            int length = Integer.parseInt(wordLengthData[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }
}
