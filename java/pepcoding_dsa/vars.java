package pepcoding_dsa;

public class vars {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println("No BODMAS in java");
        // * / % has same precedence and evaluated from left to right while 
        // + - has Lower precedence than * / % and have same precedenc between both also 
        //evaluated from left to right
        /*
         * System.out.println(x * y / x + y); --> 20
         * System.out.println((x * y) / (x + y)); --> 6
         */
        System.out.println("It should print 1.5 but it prints " + 10 + 20 / 5 * 10 % 3);
        System.out.println("It should print 1.5 but it prints " + (10 + 20) / 5 * (10 % 3));
    }
}
