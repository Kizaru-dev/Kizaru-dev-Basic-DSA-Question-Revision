package days.day1;

public class AverageOfElement {
    public static void main(String[] args) {
        // average of element .
        int[] nums = {21,23,22,32,12,11};
        averageOfElement(nums);
    }

    static void averageOfElement(int[] nums){
        int l = nums.length ;
        int sum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        int result = sum / l ;
        System.out.println("the average of this arrayy is : " + result );
    }
}
