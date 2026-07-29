package Challenge.src;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.println("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Now, Enter second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Total: " + sum);
    }
}
