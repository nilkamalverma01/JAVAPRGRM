import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("!!WELCOME TO ODD-EVEN CHECKER!!");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is an Even.");
        } else {
            System.out.println("Number is a Odd.");
        }
    }
}
