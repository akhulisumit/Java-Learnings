import java.util.Scanner;

public class Exercise8 {

    //Two numbers are entered by the user, x and n. 
    //Write a function to find the value of one number raised to the power of another 

    public static double getPower(double x, int n){
        return Math.pow(x, n);


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double x = sc.nextDouble();
        System.out.print("Enter the Power: ");
        int n = sc.nextInt();

        getPower(x, n);
        System.out.println(getPower(x, n));
        sc.close();
    }
    
}
