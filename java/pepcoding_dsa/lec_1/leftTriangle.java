package pepcoding_dsa.lec_1;
public class leftTriangle {
    static void leftPattern(int n){
        for(int i = 0; i < n; i++){
           System.out.print("* ");
        }
    }
    public static void main(String[] args) {
        System.out.println("1st Method Left Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.err.println();
        System.out.println("2nd Method");
        System.out.println("*\n**\n***\n****\n*****");
    }
}
