public class variable {
    public static void main(String[] args) {
        //variable
        //String name = "Tony Stark";
        //int age = 18;
        int a = 3;
        int b = 4;
        b = 5; //we can always assign new values
        
        int sum = a + b;
        System.out.println(sum);

        int diff = b-a;
        System.out.println(diff);

        int product = a*b;
        System.out.println(product);

        a=10;
        b=5;

        int ans1 = a*b/a-b;
        System.out.println(ans1);

        int ans2 = (a*b)/(a-b); 
        System.out.println(ans2);


    }
}
