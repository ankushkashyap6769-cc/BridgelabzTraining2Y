package PracticeProblem;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static double calculateAverageOfThreeNumbers(double numberOne, double numberTwo, double numberThree){
        return (numberOne + numberTwo + numberThree)/3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double numberOne = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double numberTwo = input.nextDouble();
        System.out.print("Enter Third Number: ");
        double numberThree = input.nextDouble();
        System.out.println("The Average is: " + calculateAverageOfThreeNumbers(numberOne,numberTwo,numberThree));
    }
}
