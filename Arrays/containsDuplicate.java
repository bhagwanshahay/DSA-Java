package Arrays;

import java.util.HashSet;

public class containsDuplicate {
    public static  boolean containsDuplicate(int[] nums) {
        int currentNumber ;
            for (int i = 0 ; i < nums.length ; i++) {
                currentNumber  = nums[i] ;

                for(int j = i + 1 ; j < nums.length ; j ++) {
                    if ( currentNumber == nums[j]) {
                        return true;
                }

            }    
    }
     return false;
  }
  
    public  static boolean DuplicateCheck(int[] nums) {
       HashSet<Integer> number = new HashSet<>();

       for (int i = 0; i < nums.length; i++) {
            if (number.contains(nums[i])) {
                return true;
            } else {
                 number.add(nums[i]);
            }
           
        
       }
       return false;
}
    public static  void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(DuplicateCheck(nums));
    }
}
