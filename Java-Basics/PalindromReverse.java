

public class PalindromReverse {
    public static void main(String[] args) {
        int num = 121;
        int orignal = num;
        int reverse = 0;

        while( num > 0) {
            int digit = num % 10  ;
            reverse = reverse * 10 + digit;
            num = num / 10 ;
        }
        if(orignal == reverse ) {
            System.out.println(orignal  +" is a Palindrom Number.");
        }else {
            System.out.println(orignal + " is Not a Palindom Number.");
        }

    }
}
