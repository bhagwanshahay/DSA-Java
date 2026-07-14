public class basicMaths {
    static void printDigits(int number){
        while(number != 0) {
            int lastDigit = number % 10;
            System.out.println(  lastDigit);
            number = number / 10;
        }
    }
    static void countDigit(int number){
        
        int count = 0 ;
        
        while( number != 0) {
            int lastDigit = number % 10 ;
            count += 1 ;   
            number = number /10 ;
        }
        System.out.println("This is the count of digits : " + count);
    }

    static void sumDigit(int number){
        
        int sum = 0 ;
        
        while( number != 0) {
            int lastDigit = number % 10 ;
            sum += lastDigit;
            number = number /10 ;
        }
        System.out.println("this is the Sum of digits : "+ sum);
    }

    static int reverseNum(int number) {
        int reverse = 0; 
        int ans = 0;

        while (number != 0 ) {
            reverse = number % 10;
           ans = ans * 10 + reverse;
            number /= 10 ;
            
        }
       
        return ans;
    }
    public static void main(String[] args) {
        int number = 53127;
        // printDigits(number);
        // countDigit(number);
        // sumDigit(number);
        System.out.println(reverseNum(number));
        
        


    }
}
