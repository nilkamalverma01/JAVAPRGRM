import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO TEMPERATURE CALCULATOR");
        System.out.print("Enter your temp in f: ");
        float fahren = input.nextFloat();

        float cel = (fahren - 32) * 5 / 9;
        System.out.println("Tempersture is: " + cel + "C");
    }
}
