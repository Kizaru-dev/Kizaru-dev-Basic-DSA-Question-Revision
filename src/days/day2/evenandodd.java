package days.day2;

public class evenandodd {
    public static void main(String[] args) {
        // find the odd and even element within the array .
        int[] nums = {2,3,4,5,6,76,7,7,43,2,1};
        evenChecker(nums);
        oddChecker(nums);
    }
    static void evenChecker(int[] nums){

        int count = 0 ;

        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("The total even element in this array are : " + count);
    }

    static void oddChecker(int[] nums){
        int count = 0 ;
        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] %  2!= 0 ){
                count++ ;
            }
        }
        System.out.println("The total odd element in this array are : "+ count);
    }


}
