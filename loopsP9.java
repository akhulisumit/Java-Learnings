import java.util.Scanner;

public class loopsP9 {
    public static void main(String[] args) {
        //Print if a number is prime or not (Input n from the user). 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 2;
        while (i < n) {

        if (n % i == 0) {
            System.out.println("This is not prime");
        }

        else {
            System.out.println("This is a prime number");
        }

        i++;

    }

        sc.close();

    }
    
}
