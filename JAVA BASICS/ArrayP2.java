import java.util.Scanner;

public class ArrayP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];

        //intput
        for(int i = 1; i <size; i ++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i = 1; i < size; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
