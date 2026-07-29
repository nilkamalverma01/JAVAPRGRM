import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 5;
        System.out.print("Enter Number: ");
        int x1 = input.nextInt();
        System.out.println(a + "+" + x1);
        a += x1;
        System.out.println(a);

        System.out.print("Enter Number: ");
        int x2 = input.nextInt();
        System.out.println(a + "-" + x2);
        a -= x2;
        System.out.println(a);

        System.out.print("Enter Number: ");
        int x3 = input.nextInt();
        System.out.println(a + "*" + x3);
        a *= x3;
        System.out.println(a);

        System.out.print("Enter Number: ");
        int x4 = input.nextInt();
        System.out.println(a + "/" + x4);
        a /= x4;
        System.out.println(a);
    }
}
