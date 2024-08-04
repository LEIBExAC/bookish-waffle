// Code to count the number of vowels in a string
import java.util.Scanner;
public abstract class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        for(int i = str.length(); i > 0; i--){
            switch (str.charAt(i-1)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
