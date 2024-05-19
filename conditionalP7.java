import java.util.Scanner;

public class conditionalP7 {
    public static void main(String[] args) {
        
//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	// 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number A");
        int a = sc.nextInt();

        System.out.println("Enter the operation +, -, *, /, %");
        char operation = sc.next().charAt(0);

        System.out.println("enter the number B");
        int b = sc.nextInt();
        

        switch (operation) {
            case '+': System.out.println(a+b);
            break;

            case '-': System.out.println(a-b);
            break;

            case '*': System.out.println(a*b);
            break;

            case '/': System.out.println(a/b);
            break;

            case '%': System.out.println(a%b);
            break;
        
            default:System.out.println("Invalid");
                break;
        }
        
    

    }
    
}
