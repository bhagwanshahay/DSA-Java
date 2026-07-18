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
    static int GCD(int a, int b ) {
           

            while ( b != 0) {
                int oldValueOfB = b;
                b = a % b;
                a = oldValueOfB;
            }
            int ans = a;
            return ans;
    }
    static int LCM(int a,int b) {
        int gcd = GCD(a, b);
        int prod = a*b;
        int lcm = prod/gcd ;
        return lcm;
    }
    public static void main(String[] args) {
        int number = 321;
        // printDigits(number);
        // countDigit(number);
        // sumDigit(number);
        System.out.println(reverseNum(number));
        int a = 18;
        int b = 12;
        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
        
        


    }
}
