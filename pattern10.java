public class pattern10 {
    public static void main(String[] args) {
        // Butterfly pattern

        int n = 20;

        //upper half
        for (int i = 1; i <= n; i++){

            //firt part stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //second part spaces
            for (int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //third part stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--){

            
            //firt part stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //second part spaces
            for (int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            //third part stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            }     

            System.out.println();

        }
    }

