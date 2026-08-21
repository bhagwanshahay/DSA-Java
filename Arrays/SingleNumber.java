package Arrays;

import java.util.HashMap;

public class SingleNumber {
    static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i] , map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        for (Integer temp : map.keySet()) {
            if (map.get(temp) == 1 ){
               return temp;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
