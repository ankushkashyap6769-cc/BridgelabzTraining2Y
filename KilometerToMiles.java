package PracticeProblem;

import java.util.Scanner;

public class KilometerToMiles {
    public static double convertKilometerToMile(double kilometer){
        return kilometer * 0.621371;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Distance in Kilometer: ");
        double kilometer = input.nextDouble();
        System.out.println("Distance: " + convertKilometerToMile(kilometer) + " miles");
    }
}
