import java.util.Scanner;

public class anagram {
    public static boolean ana(String str1, String str2) {
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
        System.out.print("Enter 1st string: ");
        String str1 = sc.next();
        System.out.print("Enter 2nd string: ");     
        String str2 = sc.next();
        sc.close();
        System.out.println(ana(str1, str2));
    }
}