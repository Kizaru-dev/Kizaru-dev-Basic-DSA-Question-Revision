package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Find the Second largest element.
        int [] n = {12,12,452,124,124};
        secondLargestElement(n);
    }
    static void secondLargestElement(int[] n){
        int first = 0 ;
        int second = 0 ;

        for(int i = 0 ; i < n.length ; i++){
            if(first < n[i]){
                second = first ;
                first = n[i];
            }else if (n[i] > second && n[i] != first){
                second = n[i];
            }
        }
        System.out.println("The Second Largest element is : " + second);
    }
}
