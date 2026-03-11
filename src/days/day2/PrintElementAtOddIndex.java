package days.day2;

public class PrintElementAtOddIndex {
    public static void main(String[] args) {
        int[] nums = {32,33,23,32,22,22,32};
        oddIndex(nums);
    }
    static void oddIndex(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 != 0){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
