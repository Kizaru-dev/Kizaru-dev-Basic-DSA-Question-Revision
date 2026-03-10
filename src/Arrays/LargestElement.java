package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        // Find the Largest element in an array .
        int[] n = {12,12,32,41,22,124};
        largestElement(n);
    }
    static void largestElement(int[] n ){

        int min = Integer.MIN_VALUE;
        
        for(int i = 0 ;i < n.length ; i++){
            if(min < n[i]){
                min = n[i];
            }
        }
        System.out.println("The maximum element in this array is : " + min);
    }
}
