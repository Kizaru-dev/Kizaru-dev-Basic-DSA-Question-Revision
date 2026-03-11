package days.day2;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {23,232,44,242,22,113};

        secondElementFinder(nums);
    }
    static void secondElementFinder(int [] nums){
        int first = 0 ;
        int second = 0 ;
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] > first){
                second = first ;
                first = nums[i];
            }
            else if(nums[i] > second && nums[i] != first){
                second = nums[i];
            }
        }
        System.out.println("The second largest element in this array is : " + second);
    }
}
