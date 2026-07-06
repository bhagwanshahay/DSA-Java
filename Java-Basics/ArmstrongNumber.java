public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0 ) {
            int temp = num % 10;
           sum =  sum + temp * temp  * temp ;
            num = num / 10;  
        }
        if(original == sum) {
            System.out.println(original + " is Armstrong Number.");
        }else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
    
}
