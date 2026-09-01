package Arrays.Level_2;

import java.util.Scanner;

public class FindBonus {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            double sal = scanner.nextDouble();
            double yrs = scanner.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            } else {
                salary[i] = sal;
                yearsOfService[i] = yrs;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            totalOldSalary += salary[i];
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
