package pepcoding_dsa;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        //System.out.println();
        while(marks < 0 || marks > 100){
            System.out.print("Invalid marks. Please enter marks between 0 and 100: ");
            marks = sc.nextInt();
        }
        sc.close();

        if (marks > 90 && marks <= 100) {
            System.out.println("Excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Good");
        }else if (marks > 70 && marks <= 80) {
            System.out.println("Average");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Fair");
        }else{
            System.out.println("Poor");
        }
    }
}
