package days.day2;

public class PrintElementAtEvenIndex {
    public static void main(String[] args) {
        int[] nums = {32,33,23,32,22,22,32};
        evenindex(nums);
    }
    static void evenindex(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                System.out.print(nums[i] + " ");
            }
        }
    }
}

