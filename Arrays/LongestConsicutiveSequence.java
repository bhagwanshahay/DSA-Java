package Arrays;
import java.util.*;
public class LongestConsicutiveSequence {
    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen  = 0;

        for (int num : nums) {
    set.add(num);
}

        for (int num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
