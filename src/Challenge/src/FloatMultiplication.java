import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are doing Float Multiplication\n");
        System.out.print("Enter First Decimal: ");
        double first = input.nextDouble();
        System.out.print("Enter Second Decimal: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is: " + mul);
    }
}
