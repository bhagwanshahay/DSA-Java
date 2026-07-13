package Arrays;
import java.util.Arrays;
    public class suffleArray {
    static int[] shuffle(int[] nums, int n) {
        int finalArray[] = new int[nums.length];
        int firstGroup[] = new int[n];
        int secondGroup[] = new int[n];

        for (int i = 0; i < nums.length ; i++) {
            if (i < n) {
               firstGroup[i] = nums[i];
           } else {
                secondGroup[i-n] = nums[i];
           }
        }
        for (int i = 0; i < firstGroup.length; i++) {
                finalArray[i * 2] = firstGroup[i];
                finalArray[i * 2 + 1] = secondGroup[i];
                
        }
        return finalArray;
        
    }
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
}
