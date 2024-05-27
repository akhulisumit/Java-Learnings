public class stringsP1 {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String name = firstName + " " + lastName;
        System.out.println(name);
        //cancatenation
        System.out.println("No of letters = " + name.length());

        //charAt

        for (int i = 0; i < name.length(); i++){
            System.out.println("the letters are: " + name.charAt(i));
        }

        if (firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are unequal");
        }

        String Sentence = "My name is Tony";
        String names = Sentence.substring(11, Sentence.length());
        System.out.println(names);

        String Sentence2 = "Tony Stark";
        String names2 = Sentence2.substring(0, 5);
        System.out.println(names2);
    }
}
