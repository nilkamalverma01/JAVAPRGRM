package Challenge.src;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + " Tell your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: "+ age);
        System.out.print(name + " Your Marks: ");
        float marks = input.nextFloat();
        System.out.print("Your Marks: "+ marks);
    }
}
