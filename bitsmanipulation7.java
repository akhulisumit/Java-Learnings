import java.util.*;

public class bitsmanupulation7 {
    public static void main(String[] args) {
        //Write a program to count the number of 1’s in a binary representation of the number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift n by 1 bit
            n >>= 1;
        }
        System.out.println(count);
        sc.close();

    }
}
