import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO AREA CALCULATOR");
        System.out.print("Enter Base in cms: ");
        double b = input.nextDouble();
        System.out.print("Enter Height in cms: ");
        double h = input.nextDouble();;

        double area = (b * h) / 2;
        System.out.println("Area is: " + area + " cms^2");
    }
}
