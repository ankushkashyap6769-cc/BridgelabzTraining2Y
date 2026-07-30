package PracticeProblem;

import java.util.Scanner;

public class PowerCalculation {
    public static double calculatePower(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = input.nextDouble();
        System.out.print("Enter Exponent: ");
        double exponent = input.nextDouble();
        System.out.println("Answer: " + calculatePower(base, exponent));
    }

}
