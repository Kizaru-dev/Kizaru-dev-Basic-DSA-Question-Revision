package days.day2;

import java.util.Arrays;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,3,33,33};
        int[] arr = new int[nums.length];

        for(int i= 0 ; i < nums.length ; i++){
            arr[i] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
