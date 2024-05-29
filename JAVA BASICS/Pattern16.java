public class Pattern16 {
    public static void main(String[] args) {

        //hollow rhombus
        
        int n =9;

        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){
                if (j==1||j==n||i==1||i==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
