import java.util.Scanner;
public class RemoveDuplicates {
   static int removeDuplicates(int[] nums) {
      int k = 1;
       
        for ( int i = 0; i < nums.length -1; i++) {
           int j = i + 1;
            if ( nums[i] != nums[j]) {
                    nums[k] = nums[j];
                    k++;
            }
        }
            return k;
        }  

        static void printNumber(Scanner sc) {
            int input = sc.nextInt();
            System.out.println(input);
        }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums));
        // Scanner sc = new Scanner(System.in);
        // printNumber(sc);
    }
}
