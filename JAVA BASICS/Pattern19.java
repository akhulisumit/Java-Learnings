public class Pattern19 {
    public static void main(String[] args) {
        //Print Inverted Half Pyramid. of numbers
        // 11111
        // 222
        // 33
        // 4

        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = n; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
