import java.util.Arrays;

public class TwoSumII {
    static int[] twoSum(int[] numbers, int target) {
            int cal = 0;
            int l = 0;
            int r = numbers.length - 1;
            int ans[] = new int[2];

           cal = numbers[l] + numbers[r];
            while ( l < r) {
                cal = numbers[l] + numbers[r];

                if ( cal > target ) {
                    r--;
                } else 
                if ( cal < target) {
                    l++;
           }    else   {
                ans[0] = l + 1;
                ans[1] = r + 1;
                 System.out.println(Arrays.toString(ans));
                return ans;
           }

            }
        
           
        return ans;

    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4};
        int target = 6;
        System.out.println(twoSum(numbers, target));
    }
}
