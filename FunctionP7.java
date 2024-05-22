import java.util.Scanner;

public class FunctionP7 {

    public static void printTable (int n){
        for (int i = 1; i <= 10; i++){
            int j = n*i;
            System.out.println(j);
            
        }
        return;
        
    }
    public static void main(String[] args) {
        //Make a function to print the table of a given number n

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();
        printTable(n);

        sc.close();

    }
}
