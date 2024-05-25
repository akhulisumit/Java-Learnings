import java.util.Scanner;

public class ArraysP6 {
    public static void main(String[] args) {
        //Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner sc = new Scanner(System.in);
        System.out.println("How  many number? ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAssending = true;

        for (int i = 0; i < numbers.length-1; i++ ){
            if(numbers[i]> numbers[i+1]){
                isAssending = false;
            }
        }

        if (isAssending){
            System.out.println("This is an ascending array");
        }
        else {
            System.out.println("This is a not an ascending array");
        }

        sc.close();

    }
    
}
