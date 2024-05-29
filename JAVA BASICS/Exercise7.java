import java.util.Scanner;

//Write a program to enter the numbers till the user wants.
//At the end it should display the count of positive, negative and zeros entered.  java


public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        String continueInput;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("yes"));

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
        
        scanner.close();
    }
}
