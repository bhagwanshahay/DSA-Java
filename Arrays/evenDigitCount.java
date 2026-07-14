package Arrays;

public class evenDigitCount {
    static int findNumbers(int[] nums) {
            
            int ans = 0; 
            int number ;

            for (int i = 0 ; i < nums.length ; i++) {
                number = nums[i];
                int digitCount = 0; 

                if (number == 0) {
                    digitCount = 1;
                } else {

                while (number > 0) {
                
                    number /= 10;
                 digitCount ++;
                 
        } 
    }

        if (digitCount % 2 == 0 ) {
            
            ans ++;

        }
            }

        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        // int nums[] = {0};
        System.out.println(findNumbers(nums));
    }
}
