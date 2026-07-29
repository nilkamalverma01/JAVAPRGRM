//import java.util.Scanner;
//
//public class LearningIf {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Is Senior Citizen: ");
//        boolean name = input.nextBoolean();
//
//        //boolean isMale = false;
//        //String name = "Bob";
//
//        if (name) {
//            System.out.println("Mr." + name);
//        }
//        else {
//            System.out.println("Ms." + name);
//        }
//    }
//}

import java.util.Scanner;
public class LearningIf {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Are you Senior citizen(Yes/No): ");
         String answer = input.nextLine();

         if (answer.equalsIgnoreCase("Yes")) {
             System.out.println("Great");
         }
         else{
             System.out.println("Better Luck Next Time.");
         }


    }
}
