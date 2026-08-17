package Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
   
    static int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            set.add(nums2[j]);
        }

        int[] result = new int[set.size()];

        int i = 0;
        for (int value : set) {
            result[i] = value;
            i++;
        }

        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {1,2,7};
        System.out.println(unionArray(nums1,nums2));
        
    }
}

