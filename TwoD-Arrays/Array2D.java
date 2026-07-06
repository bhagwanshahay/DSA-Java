public class Array2D {
    public static void main(String []args) {
        //sum
        int arr[][] = {{1,2,3},{21,20,19}};
        int sum = 0;

        for(int i=0; i<= arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
               sum = sum + arr[i][j];
            }

        }
        System.out.println(sum);


        //multi
        int  brr[][] = {{1,2,3},{1,2,3}};
        int muli = 1;

        for(int i=0; i<= brr.length-1; i++) {
            for(int j=0; j<=brr[i].length-1; j++) {
              muli  = muli * brr[i][j];
            }

        }
        System.out.println(muli);


        //max
        int rr[][] = {{1,2,3},{21,20,19}};
        int max = rr[0][0];

        for(int i =0; i<=rr.length-1; i++) {
            for(int j=0; j<= rr[i].length-1; j++) {
                if(max < rr[i][j]) {
                    max = rr[i][j];
                }
            }
        }
        System.out.println("This is the maximux value of this 2D array : " + max);

        //min
        int op[][] = {{1,2,3},{21,20,19}};
        int min = op[0][0];

        for(int i =0; i<=op.length-1; i++) {
            for(int j=0; j<= op[i].length-1; j++) {
                if(min > op[i][j]) {
                    min = op[i][j];
                }
            }
        }
        System.out.println("This is the minimum value of this 2D array : " + min);









// int arr[][] = new int[3][4];
    // Scanner input = new Scanner(System.in);
    
    
    // for(int i=0; i<=arr.length-1; i++) {
    //     for(int j=0; j<=arr[i].length-1; j++) {
    //         System.out.println("Provide value for row = " + i + " and column = " + j);
    //         arr[i][j] = input.nextInt();
    //     }
        
       
    // }
    //  //printing elements of array 
    //     for(int in =0; in<=arr.length-1; in++) {
    //         for(int jn=0; jn<=arr[in].length-1; jn++) {
    //             System.out.print(arr[in][jn] + " ");
    //         }
    //         System.out.println();
    //     }

    // int arr[][];
    // arr = new int[2][2];

    // int arrr[][] = {{1,2},{2,3},{3,4},{4,5},{5,6}}; 
    // int rowlength = arrr.length;
    // int collength = arrr[0].length;

    // for(int rowIndex=0; rowIndex<=rowlength-1; rowIndex++) {
    //     for(int colIndex=0; colIndex<=collength-1; colIndex++){
    //         System.out.print(arrr[rowIndex][colIndex] + " " );
    //     }
    //     System.out.println();
    // }

    // int brr[][] = {{1,2},{2,3,4,5},{3,4,4,5,6,7},{4}};
    // int rowlength1 = brr.length;

    // for(int rowIndex1=0; rowIndex1<=rowlength1-1; rowIndex1++) {
    //     int collength1 = brr[rowIndex1].length; 
    //     for(int colIndex1=0; colIndex1<=collength1-1; colIndex1++){
    //         System.out.print(brr[rowIndex1][colIndex1] + " " );
    //     }
    //     System.out.println();
    // }




    





    
   }
}
