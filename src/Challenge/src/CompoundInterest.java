import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount Rs.");
        int principle = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.print("Enter Year Terms: ");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("your compoud interest is Rs." + compInt);
    }
}
