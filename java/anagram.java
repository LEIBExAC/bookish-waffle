
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        Boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(str2.length() - i - 1)) {
                    isAnagram = false;
                }
            }
        }
        System.out.println(isAnagram);
    }
}
