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
        static void studentGrade(int marks) {
            if (marks >= 90) {
                System.out.println("Grade A");
            } else {
                if (marks >= 70) {
                    System.out.println("Grade B");
                } else {
                    if ( marks >= 50) {
                        System.out.println("Grade C");
                    } else {
                        if (marks >= 35) {
                            System.out.println("Grade D");
                        } else {
                            System.out.println("Fail");
                        }
                    }

                }
            }
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums));


        // Scanner sc = new Scanner(System.in);
        // printNumber(sc);

        // int marks = 95;
        // studentGrade(marks);


    }
}
