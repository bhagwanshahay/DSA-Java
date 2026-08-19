package Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
   
    static int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int current = 0;

        ArrayList<Integer> result = new ArrayList<>();

       
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                current = nums1[i];
                i++;

            } else if (nums1[i] > nums2[j]) {
                current = nums2[j];
                j++;

            } else {
                current = nums1[i];
                i++;
                j++;
            }

            if (result.isEmpty() ||
                result.get(result.size() - 1) != current) {
                result.add(current);
            }
        }

       
        while (i < nums1.length) {
            current = nums1[i];
            i++;

            if (result.isEmpty() ||
                result.get(result.size() - 1) != current) {
                result.add(current);
            }
        }

       
        while (j < nums2.length) {
            current = nums2[j];
            j++;

            if (result.isEmpty() ||
                result.get(result.size() - 1) != current) {
                result.add(current);
            }
        }

       
        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {1,2,7};
        System.out.println(unionArray(nums1,nums2));
        
    }
}

