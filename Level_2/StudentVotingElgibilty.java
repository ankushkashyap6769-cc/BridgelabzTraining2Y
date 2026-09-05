package String.Level_2;
import java.util.Scanner;
public class StudentVotingElgibilty {
    public static int[] generateStudentAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibilityData = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            boolean canVote = false;

            if (age >= 18) {
                canVote = true;
            } else if (age < 0) {
                canVote = false;
            }

            eligibilityData[i][0] = String.valueOf(age);
            eligibilityData[i][1] = String.valueOf(canVote);
        }

        return eligibilityData;
    }

    public static void displayEligibilityTable(String[][] eligibilityData) {
        System.out.println("\nStudent\t\tAge\t\tCan Vote?");
        System.out.println("----------------------------------------");

        for (int i = 0; i < eligibilityData.length; i++) {
            int studentNum = i + 1;
            String age = eligibilityData[i][0];
            String canVote = eligibilityData[i][1];

            System.out.println("Student " + studentNum + "\t" + age + "\t\t" + canVote);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 10;

        System.out.print("Choose mode - Enter '1' to manual input, '2' to generate random ages: ");
        int choice = scanner.nextInt();

        int[] ages = new int[numberOfStudents];

        if (choice == 1) {
            System.out.println("Enter the ages of 10 students:");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Age for student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }
        } else {
            ages = generateStudentAges(numberOfStudents);
        }

        String[][] eligibilityResults = checkVotingEligibility(ages);
        displayEligibilityTable(eligibilityResults);
    }
}
