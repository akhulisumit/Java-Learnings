import java.util.*;

public class conditionalP2 {
    public static void main(String[] args ) {

        //to find if the given number is Odd or Even

        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        int remainder = input%2;

        if (remainder == 1) {
            System.out.println("Odd");
        }

        else {
            System.out.println("Even");
        }

        sc.close();

    }
    
}
