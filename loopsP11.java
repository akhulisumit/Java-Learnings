import java.util.Scanner;

public class loopsP11 {
    public static void main(String[] args) {
        
        // a student’s marks(out of 100). 
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
        // 	Because marks don’t matter but our effort does.

        Scanner sc = new Scanner(System.in);
        int marks;

        do {
            System.out.print("Please enter your marks : ");
            marks = sc.nextInt();

            if (marks>= 90 && marks <= 100) {
                System.out.println("This is good");
            }

            else if (marks>= 60 && marks <= 89) {
                System.out.println("This is also good");
            } 

            else if (marks>= 0 && marks <= 59){
                System.out.println("This is good as Well");
            }
            else {
                System.out.println("Enter the valid marks between 0 to 100");
            }
        } while (marks<= 0 || marks >= 100);

        sc.close();

    }
}
