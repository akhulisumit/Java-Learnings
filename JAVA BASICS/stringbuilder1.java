public class stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str);

        //char at 0
        System.out.println(str.charAt(0));

        //set char at 0
        str.setCharAt(0, 'h');
        System.out.println(str);

        //insert
        str.insert(0, 'S');
        System.out.println(str);

        str.insert(3, 'n');
        System.out.println(str);

        //delete
        str.delete(3,5);
        System.out.println(str);

        //append
        str.append("a");
        str.append("l");
        System.out.println(str);

    }
}
