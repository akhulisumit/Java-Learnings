import java.util.Scanner;

public class stringsP3 {
    public static void main(String[] args) {
        //Input a string from the user. 
        //Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'e' ){
                result += 'i';

            }

            else {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
