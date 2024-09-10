package pepcoding_dsa.lec_2;

public class SelfPattern {
    static void selfPattern() {
        char [] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,! abcdefghijklmnopqrstuvwxyz".toCharArray();
        String str = "Hello, World!";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < alpha.length; j++) {
                if (str.charAt(i) == alpha[j]) {
                    System.out.print(alpha[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        selfPattern();
    }
}
