public class pattern13 {
    public static void main(String[] args) {
         //pallidromic number pattern

         int n = 5;

         for (int i = 1; i <= n ; i++){
            // spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //for first set of numbers
            for (int j = i; j >= 1; j-- ){
                System.out.print(j);
            }

            for (int j = 2; j<= i; j++){
                System.out.print(j);
            }

            //for secondset of numbers
            System.out.println();  
         }
    }
}
