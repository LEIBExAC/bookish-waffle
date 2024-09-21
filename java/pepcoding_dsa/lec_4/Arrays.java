package pepcoding_dsa.lec_4;

public class Arrays {
    public static void main(String[] args) {
        /*int marks[]; // Declaration
        marks = new int[5]; // Initialization and also Space allocation
        marks[0] = 1;
        marks[1] = 2;
        marks[3] = 50;
        marks[2] = 80;
        marks[4] = 44;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int arr[] = new int[5]; // Declaration + Initialization(Assignment)
        System.out.println(arr[2]); // 0 by default
        System.out.println(arr[1]); // 0 by default*/

        int [] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;
        int[] two = one;
        two[1] = 200;
        for(int i = 0; i < one.length; i++){
            System.out.println("one " + one[i]);
        }
        for(int i = 0; i < two.length; i++){
            System.out.println("two " + two[i]);
        }
    }
}
