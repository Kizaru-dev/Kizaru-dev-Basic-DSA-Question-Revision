package Pattern;

public class StarPattern {
    public static void main(String[] args) {
        // Star Pattern .
        /*
        *
        * *
        * * *
        * *  * *
         */
        // Build program to print star pattern .
        int n = 5 ;
        starPattern(n);
    }
    public static void starPattern(int n ){

        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
