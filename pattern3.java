public class pattern3 {
    public static void main(String[] args) {
        //half pyramid

        int n = 88;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
