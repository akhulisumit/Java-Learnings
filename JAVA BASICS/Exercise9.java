import java.util.Scanner;

public class Exercise9 {

//Write a function that calculates the Greatest Common Divisor of 2 numbers.

public static void getFactor(int a, int b){
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        

    }
    System.out.println(a);
    
    
    return;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    getFactor(a, b);

    sc.close();
}
    
}
