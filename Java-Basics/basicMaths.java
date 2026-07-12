public class basicMaths {
    static void printDigits(int number){
        while(number != 0) {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
    }
    public static void main(String[] args) {
        int number = 53127;
        printDigits(number);

    }
}
