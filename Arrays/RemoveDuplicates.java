public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int k = 0;
        nums[0] = nums[0];
        for ( int i = 0; i < nums.length -1; i++) {
           int j = i + 1;
            if ( nums[i] != nums[j]) {
                    nums[k + 1] = nums[j];
                    k++;
            }
        }
            return k;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
