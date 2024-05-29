import java.util.Scanner;

public class twoDarrays3 {

    //For a given matrix of N x M, print its transpose.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows? ");
        int rows = sc.nextInt();
        System.out.print("Number of Columns? ");
        int cols = sc.nextInt();
        

        int Matrix [][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < cols; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(Matrix[j][i]+ " ");
            }
            System.out.println();

        }
        sc.close();
    }
    
}
