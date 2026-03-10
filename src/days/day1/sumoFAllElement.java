package days.day1;

public class sumoFAllElement {
    public static void main(String[] args) {
        // Sum of all the element in this array .
        int[] nums = {12,12,41,21,123,21};
        sumofElement(nums);
    }
    static void sumofElement(int[] nums){
        int l = nums.length;
        int sum = 0 ;
        for(int i = 0 ;i < l ; i++){
            sum += nums[i];
        }

        System.out.println("The total sum of this element is : " + sum );
    }

}
