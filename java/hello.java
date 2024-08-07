import java.util.Scanner;

public class hello {
    public static boolean anagram(String str1, String str2) {
        int strArray[] = new int[26];
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            strArray[str1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < str2.length(); j++) {
            strArray[str2.charAt(j) - 'a']--;
            if (strArray[str2.charAt(j) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();
        System.out.println(anagram(str1, str2));
    }
}