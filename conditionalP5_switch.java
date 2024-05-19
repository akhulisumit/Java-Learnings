import java.util.Scanner;

public class conditionalP5_switch {
    public static void main(String[] args) {

        //1 hello, 2 namaste, 3 bonjour using switch
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
                   
        }

        sc.close();


    }
    
}
