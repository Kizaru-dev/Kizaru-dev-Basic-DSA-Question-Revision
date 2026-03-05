package Pattern;

public class ReverseStar {
    public static void main(String[] args) {
        /*
        Pattern Reverse Star Pattern .
        *****
        ****
        ***
        **
        *
         */
        int n = 5 ;
        reversePattern(n);
    }
    public static void reversePattern(int n){

        for(int i = n ; i >= 1 ; i--){
            for(int j = 0; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
