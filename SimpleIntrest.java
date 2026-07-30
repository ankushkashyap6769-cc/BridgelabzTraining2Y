package PracticeProblem;
import java.util.Scanner;

public class SimpleIntrest {

    public double calculateSimpleIntrest(double principal, double rate, int time){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleIntrest si = new SimpleIntrest();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal rate: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time: ");
        int time = input.nextInt();
        System.out.println("Your Simple Intrest is: " + si.calculateSimpleIntrest(principal, rate, time));
    }

}
