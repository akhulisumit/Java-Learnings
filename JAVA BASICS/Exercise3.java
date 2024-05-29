import java.util.Scanner;

public class Exercise3 {

    //Write a function which takes in 2 numbers and returns the greater of those two.

    public static void getGreater(int a, int b){
        if (a < b){
            System.out.println(b + " is greater");
        }

        else if (b < a){
            System.out.println(a + " is greater");
        }

        else{
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        getGreater(a, b);

        sc.close();
        
    }
}
