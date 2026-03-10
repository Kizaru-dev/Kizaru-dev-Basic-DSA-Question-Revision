package days.day1;

public class SmallestElementInArray {
    public static void main(String[] args) {
        // find the smallest element in this array .
        int[] nums  = {12,23,22,12,41};
        smallestElement(nums);

    }
    static void smallestElement(int[] nums){
        int l = nums.length ;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < l ; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println("The smallest element in this array is : " + min);
    }
}
