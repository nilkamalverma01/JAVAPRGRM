import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO SIMPLE INTEREST CALCULATOR");
        System.out.print("Enter Principle Amount Rs.");
        int principle = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.print("Enter Year Terms: ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\nYour Simple Interest is Rs." + interest);
    }
}
