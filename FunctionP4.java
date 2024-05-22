import java.util.Scanner;

public class FunctionP4 {

    //To find the factorial of the given number
    
    public static void printFactorial(int x){

        if (x<0){
            System.out.println("Invalid Number");
            return;

        }
        int factorial = 1;

        for (int i = x; i>= 1; i--){
            factorial= factorial*i;
        }

        System.out.println(factorial);
        return;

    }      
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printFactorial(x);

        sc.close();
    }
}
