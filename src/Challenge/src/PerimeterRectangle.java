import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PERIMETER CALCULATOR");
        System.out.print("Enter all 4 sides in cms: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();

        double peri = first + second + third + fourth;
        System.out.println("Perimeter is: " + peri);
    }
}
