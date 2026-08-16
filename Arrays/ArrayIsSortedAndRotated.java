package Arrays;

public class ArrayIsSortedAndRotated {
    static boolean check(int[] nums) {
         int b = 0;
         int n = nums.length;

         for ( int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % n] ) {
                b ++;
            }
         }

         if ( b > 1) {
            return false;
         } else {
            return true;
         }
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        System.out.println(check(nums));
    }
}