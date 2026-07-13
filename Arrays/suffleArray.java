package Arrays;

public class suffleArray {
    static int[] shuffle(int[] nums, int n) {
        int finalArray[] = new int[nums.length];
        int firstGroup[] = new int[n];
        int secondGroup[] = new int[n];

        for (int i = 0; i < nums.length ; i++) {
            if (i < n) {
               firstGroup[i] = nums[i];
           } else {
            secondGroup[i] = nums[i-1];
           }


        }
        return firstGroup;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        shuffle(nums,3);
    }
}
