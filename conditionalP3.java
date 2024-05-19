import java.util.*;

public class conditionalP3 {       
    public static void main(String[] args) {
       
        // to compare two numbers a and b

        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("a is greater than b");
        }

        else if (a<b) {
            System.out.println("a is smaller than b");
        }
 
        if (a==b) {
            System.out.println("a is equals to b");
        }

        sc.close();

    }
    
}
