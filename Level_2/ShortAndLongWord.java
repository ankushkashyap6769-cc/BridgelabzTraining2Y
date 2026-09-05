package String.Level_2;
import java.util.Scanner;
public class ShortAndLongWord {
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

    public static int[] findShortestAndLongestIndexes(String[][] wordLengthData) {
        if (wordLengthData.length == 0) {
            return new int[]{-1, -1};
        }

        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordLengthData[0][1]);
        int maxLength = Integer.parseInt(wordLengthData[0][1]);

        for (int i = 1; i < wordLengthData.length; i++) {
            int currentLength = Integer.parseInt(wordLengthData[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        String[] words = splitText(userInput);
        String[][] wordLengthData = getWordsWithLength(words);

        int[] resultIndexes = findShortestAndLongestIndexes(wordLengthData);

        int minIndex = resultIndexes[0];
        int maxIndex = resultIndexes[1];

        if (minIndex != -1 && maxIndex != -1) {
            String shortestWord = wordLengthData[minIndex][0];
            int shortestLength = Integer.parseInt(wordLengthData[minIndex][1]);

            String longestWord = wordLengthData[maxIndex][0];
            int longestLength = Integer.parseInt(wordLengthData[maxIndex][1]);

            System.out.println("Shortest Word: " + shortestWord + " (Length: " + shortestLength + ")");
            System.out.println("Longest Word: " + longestWord + " (Length: " + longestLength + ")");
        } else {
            System.out.println("No words found.");
        }
    }
}
