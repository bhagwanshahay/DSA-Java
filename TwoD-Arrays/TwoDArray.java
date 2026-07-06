import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int numbers[][]  = new int [row][col] ;


        
        for(int i=0; i<row; i++ ) {
            
            for(int j=0; j<col; j++) {
              numbers[i][j] =  input.nextInt();

            }
        }
        
        System.out.println("Enter a number to Check : ");
        int x = input.nextInt();
        for(int i =0; i< row; i++ ) {
            for(int j=0; j<col; j++ ) {
                if(x == numbers[i][j] ) {
                    System.out.println("The number is on index : "+i +","+ j);
                }else 
                System.out.println("The number is not found!  ");
            }
        }



       
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
