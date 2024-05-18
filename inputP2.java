import java.util.*;
 
public class inputP2 {
    public static void main(String[] args) {
        //Make a program that takes the radius of a circle as input, 
        //calculates its radius and area and prints it as output to the user.

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);

    }
}