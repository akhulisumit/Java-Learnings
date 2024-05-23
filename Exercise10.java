import java.util.Scanner;

public class Exercise10 {

    //Write a program to print Fibonacci series of n terms where n is input by user :
    //0 1 1 2 3 5 8 13 21 ..... 
    //In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

    public static void getSum(int n){
        int first = 0;
        int second = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        getSum(n);
        sc.close();
    }
}
