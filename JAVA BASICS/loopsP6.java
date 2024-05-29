import java.util.Scanner;

public class loopsP6 {
    public static void main(String[] args) {

        //sum of n numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println(sum);
        sc.close();
    }
    
}
