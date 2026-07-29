import java.util.Scanner;
public class TrueorFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true if the person is a senior citizen, otherwise enter false:");

        boolean isSenior= sc.nextBoolean();

        if (isSenior){
            System.out.println("This person is Senior: ");
        }else{
            System.out.println("This person is not:");
        }
    }
}
