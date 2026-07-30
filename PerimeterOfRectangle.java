package PracticeProblem;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static double calculatePerimeterOfTriangle(double length, double width){
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length = input.nextDouble();
        System.out.print("Enter Width: ");
        double width = input.nextDouble();
        System.out.println("Perimeter of rectangle is: " + calculatePerimeterOfTriangle(length,width));
    }

}
