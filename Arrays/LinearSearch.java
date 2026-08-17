package Arrays;

public class LinearSearch {
    static int linearSearch(int nums[], int target) {
		int ans = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                ans = i;
                return ans;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 3};
        int target = 3;
        System.out.println(linearSearch(nums,target));
    }
}
