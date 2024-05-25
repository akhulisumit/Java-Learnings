import java.util.Scanner;

public class ArrayP5 {
    public static void main(String[] args) {
        //Find the maximum & minimum number in an array of integers

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for( int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for( int i = 0; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }

            if (numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
        sc.close();

    }
}
