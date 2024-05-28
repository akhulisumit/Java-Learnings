import java.util.Scanner;

public class Bitsmanupulation4 {
    public static void main(String[] args) {
        //update bit
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        if (operation == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();

    }
}
