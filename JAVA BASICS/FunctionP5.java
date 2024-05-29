import java.util.*;

public class FunctionP5 {

    //To check if a number is prime or not

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (isPrime(n)) {
            if (n == 1) {
                System.out.println("This is neither prime nor composite.");
            } else {
                System.out.println("This is a prime number.");
            }
        } else {
            System.out.println("This is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge case for numbers less than or equal to 1
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
