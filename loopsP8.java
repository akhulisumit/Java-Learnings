import java.util.Scanner;

public class loopsP8 {
    public static void main(String[] args) {
     
        //Print all even numbers till n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 0;
        
        if (n % 2 == 0){

            while (i <= n) {
                System.out.println(i);
                i = i + 2;
            }
            
        }

        else {
            while (i < n) {
                System.out.print(i + " ");
                i = i + 2;
            }
        }

        sc.close();

    }
}
