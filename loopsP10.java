import java.util.Scanner;

public class loopsP10 {
    public static void main(String[] args) {
        
        //Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        //If the user enters 1 then keep taking input from the user 
        //If they enter 0 then stop.

        Scanner sc = new Scanner(System.in);
        System.out.print("Please entetr the number : ");
        int x = sc.nextInt();

        while (x == 1) {
            x = sc.nextInt();
        }

        sc.close();


    }
}
