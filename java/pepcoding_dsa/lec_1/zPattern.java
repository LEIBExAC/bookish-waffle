package pepcoding_dsa.lec_1;
public class zPattern {
    public static void main(String[] args) {
        System.out.println("1st Method Z Pattern");
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= 1; j--){
                if(i == 1 || i == 5 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        System.err.println();
        System.out.println("2nd Method Z Pattern");
        System.out.println("*****\n   *\n  *\n *\n*****");
    }
}
