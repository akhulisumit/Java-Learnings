import java.util.Scanner;

public class BitsManupulation5 {

    // Method to check if a number is a power of 2
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Use bitwise AND to check the condition
        // A number n is a power of 2 if it has exactly one bit set to 1 in its binary representation
        // and n & (n - 1) will be 0 if n is a power of 2
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test numbers to check
        int testNumbers = sc.nextInt();

        // Iterate through the test numbers and check if each is a power of 2
        int num = testNumbers;
        boolean result = isPowerOfTwo(num);
        System.out.println(num + " is a power of 2: " + result);
        sc.close();
        
    }
}
