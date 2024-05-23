import java.util.Scanner;

public class Exercise1 {

    public static void getAverage(int a, int b, int c){
        int average = (a + b + c)/3;
        System.out.println(average);
        return;
    }

    public static void main(String[] args) {
        //Enter 3 numbers from the user & make a function to print their average.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 1 : ");
        int b = sc.nextInt();
        System.out.print("Enter number 1 : ");
        int c = sc.nextInt();

        getAverage(a, b, c);
        sc.close();

    }
}
