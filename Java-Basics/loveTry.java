

public class loveTry {

   static  void print2Table() {
        for(int i=1;i<=10;i++){
            int ans = 2*i;
            System.out.println("2 * " + i +" = " +  ans);
        }
    }
      static void printSum(int x, int y) {
        System.out.println("Sum : " + (x + y));

     }
      static void multiply(int a, int b){
        System.out.println("Multiply : " + (a * b));
      }

      static int add(int a,int b){
        int sum = a + b;
        return sum;
      }

      static int add(int a,int b, int c){
        int sum = a + b + c;
        return sum;
      }
    public static void main(String[] args) {
        System.out.println("*");
        print2Table();
        printSum(4, 7);
        multiply(4, 7);
        int result = add(1,2);
        int result1 = add(1,2,3);
        System.out.println( result );
        System.out.println( result1 );
        

    }
}
