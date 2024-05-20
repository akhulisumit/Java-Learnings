import java.util.Scanner;

public class loopP7 {
    public static void main(String[] args) {

         // to give the table of the given number
        
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Number : ");
         int n = sc.nextInt();

         for (int i = 1; i<=10; i++){
            System.out.print(n + " X " + i +" = ");
            // System.out.print(" X ");
            // System.out.print(i);
            // System.out.print(" = ");
             System.out.println(n * i);
         }

         sc.close();


    }
    
}
