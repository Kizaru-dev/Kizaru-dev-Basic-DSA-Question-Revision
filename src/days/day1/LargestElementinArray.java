package days.day1;

public class LargestElementinArray {
    public static void main(String[] args) {
        // find the largest element in this array .
        int[] nums = {12,12,41,21,41,121};
        largestElement(nums);
    }
    static void largestElement(int[] nums){
        int l = nums.length ;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < l ; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("The maximum element in this element is : " + max);
    }
}
