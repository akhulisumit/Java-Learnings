import java.util.Scanner;

public class FunctionP6 {

    public static void checkNum (int n){
        if (n%2==0){
            System.out.println("This is an even number");
        }

        else {
            System.out.println("This is not an even number");
        }

        return;
        
    }
    public static void main(String[] args) {
        //Make a function to check if a given number n is even or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        checkNum(n);

        sc.close();
    }
}
