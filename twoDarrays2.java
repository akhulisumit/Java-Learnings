import java.util.Scanner;

public class twoDarrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int cols = sc.nextInt();
        int numbers[][] = new int [rows][cols];

        for (int i = 0; i<rows; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Which number to find: ");
        int x = sc.nextInt();

        for(int i = 0; i< rows; i++){
            for (int j = 0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i + "," + j + ")" );
                }
            }
        }
        sc.close();
    }
}
