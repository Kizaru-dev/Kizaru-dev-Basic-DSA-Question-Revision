package days.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        reverse(nums);
    }
    static void reverse(int[] nums){
        int l = nums.length ;

        for(int i = 0 ;i < l/2; i++){
            int temp = nums[i];
            nums[i] = nums[l-1-i];
            nums[l-1-i] = temp ;
        }
        System.out.println(Arrays.toString(nums));
    }
}
