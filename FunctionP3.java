import java.util.Scanner;
// to find the product of two numbers
public class FunctionP3 {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Product of 2 number is : " + calculateProduct(a, b));
        
        sc.close();
    
    }
}
