import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age <= 13) {
            System.out.println("You are child.");
        } else if (age <= 20) {
            System.out.println("You are teenager.");
        } else if (age <= 60) {
            System.out.println("You are adult.");
        }else {
            System.out.println("You are senior citizen.");
        }
    }
}
