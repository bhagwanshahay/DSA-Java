package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    static List<Integer> leaders(int[] nums) {
        ArrayList<Integer> list =  new ArrayList<>();
        int maxRight = nums[nums.length -1 ];
        list.add(maxRight);
        
        for (int i = nums.length -2; i >= 0 ; i -- ) {
        if (nums[i] > maxRight) {
            
            list.add(nums[i]);
            maxRight = nums[i];
        }
     }
     Collections.reverse(list);
     return list;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders(nums));
    }
}
