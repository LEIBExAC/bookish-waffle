package pepcoding_dsa.lec_1;

//import java.io.*;
import java.util.Scanner;

class prime {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*try {
            File myFile = new File("C:\\Users\\chatu\\OneDrive\\Documents\\practice\\java\\pepcoding_dsa\\collection_primes\\someprimes.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextInt()) {
                int data = myReader.nextInt();
                if (isPrime(data)) {
                    System.out.println("The number " + data + " is prime.");
                } else {
                    System.out.println("The number " + data + " is not prime.");
                }
                System.out.println("-----------------------------");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of primes you want to check: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number you want to check: ");
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("The number " + n + " is prime.");
            } else {
                System.out.println("The number " + n + " is not prime.");
            }
            System.out.println("-----------------------------");
        }
        sc.close();
    }
}