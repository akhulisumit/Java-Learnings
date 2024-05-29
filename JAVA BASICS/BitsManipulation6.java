import java.util.Scanner;

public class BitsManipulation6 {
    public static void main(String[] args) {
        //Write a program to toggle a bit a position = “pos” in a number “n”.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the posision to toggle : ");
        int pos = sc.nextInt();



        //get bit
        int bitMask = 1<<pos;
        //set bit
        if ((bitMask&n)== 0){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

        //clear bit
        else {
            int notBitMask = ~(bitMask);

            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
    
}
