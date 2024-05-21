public class pattern15 {
    public static void main(String[] args) {
        // Butterfly pattern

        int n = 20;
        int m = (2*n);

        //upper half
        for (int i = 1; i <= n; i++){

            //firt part stars
            for (int j = 1; j <= m; j++){
                if (i==j || j==1 || j==m || j+i== m+1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }  


        //lower half
        for (int i = n; i >= 1; i--){

            //firt part stars
            for (int j = 1; j <= m; j++){
                if (i==j || j==1 || j==m || j==m-i+1 ){
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

