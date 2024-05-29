import java.util.Scanner;

public class Exercise4 {
    //Write a function that takes in the radius as input. 
    //returns the circumference of a circle.
    public static void getCircumferece(int r, double pi){
        double Circumferece = pi * r * 2;
        System.out.println(Circumferece);
        return;
        
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        double pi = 3.14;
        getCircumferece(r, pi);

        sc.close();
    
    }

    
}
