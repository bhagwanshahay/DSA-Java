public class PrimeNumber {
    public static void main(String[] args) {
        int num = 9;

        if(num % 2 == 0 || num % 1 == 0) {
            System.out.println("This is not a prime number.");
        }else {
            System.out.println("This is a prime number");
        }

    }
}
