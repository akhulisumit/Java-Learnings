import java.util.*;

public class Exercise2 {

    public static void getSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2){
            sum = sum + i;
        }
        System.out.println(sum);

        return;
        
    }
    public static void main(String[] args) {
        //Write a function to print the sum of all odd numbers from 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        getSum(n);
        sc.close();
    }
}
