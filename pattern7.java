public class pattern7 {
    public static void main(String[] args) {
        //half pyramid with numbers

        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j ++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
