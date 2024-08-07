// Java program to reverse a number
// and find if it is a palindrome or not

import java.math.BigInteger;
import java.util.Scanner;

// Driver Class
class palindromeNumber {
	// Reverse Big Integer
	public static BigInteger reverse(BigInteger n)
	{
		String s = n.toString();
		StringBuilder sb = new StringBuilder(s);
		return new BigInteger(sb.reverse().toString());
	}

	// Main Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
        sc.close();
        if(n1 > 0){
        BigInteger n
			= new BigInteger(String.valueOf(n1));
		BigInteger reverseN = reverse(n);
		System.out.println("Reverse of n = " + reverseN);

		// Checking if n is same
		// as reverse of n
		if (n.compareTo(reverseN) == 0)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");
        } else {
            System.out.println("Not a Palindrome");
        }
	}
}