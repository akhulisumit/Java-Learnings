import java.util.Scanner;

public class bitsmanupulation8 {

    public static String BinarytoDecimal(int decimals){
        if (decimals == 0){
            return "0";
        }
        StringBuilder binarys = new StringBuilder();
        while (decimals > 0 ){
            binarys.append(decimals%2);
            decimals /= 2;
        }
        return binarys.reverse().toString();

    }

    public static int decimalToBinary(String binary){
        int decimal = 0;
        int length = binary.length();
        for (int i = 0 ; i < length; i++){
            if(binary.charAt(length - 1 - i) == '1'){
                decimal += Math.pow(2, i) ;
            }
        }
        return decimal;
    }
    public static void main(String[] args) {
        //Write 2 functions => decimalToBinary() & binaryToDecimal()
        //to convert a number from one number system to another. 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        String binary = sc.nextLine();
        System.out.print("Enter the decimal number : ");
        int decimals = sc.nextInt();

        System.out.println("The binary of " + decimals + " is " + BinarytoDecimal(decimals));
        System.out.println("The decimal of " + binary + " is " + decimalToBinary(binary));

        sc.close();

    }
    
}
