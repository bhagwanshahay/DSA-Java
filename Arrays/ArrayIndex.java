import java.util.Scanner;

public class ArrayIndex {
    static void max(int n){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0; i<= n-1; i++) {
            System.out.println("Enter " + n + " elements :");
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<=n-1; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println( "The maximum is "+ max);
        

    }
    static void min(int n){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0; i<= n-1; i++) {
            System.out.println("Enter " + n + " elements :");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<=n-1; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum is: "+min);

    }
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int num[] ;
        // int arr[];
        // arr = new int[5];
        // int brr[] = {1,2,3,4,5};

        // System.out.println(brr[0]);
        // System.out.println(brr[1]);
        // System.out.println(brr[2]);
        // System.out.println(brr[3]);
        // System.out.println(brr[4]);
        // System.out.println("[" +brr[0]  + brr[1] + brr[2] + brr[3] + brr[4]+ "]");
        // int length = brr.length -1 ;
        // for(int i=0;i<=length;i++) {
        //     System.out.print("["  + brr[i] +  "]");
        //     System.out.println();
        // }

        // for(int bhag: brr) {
        //     System.out.println(bhag);
        // }

        // int trr[] = new int[5];
        // int n = trr.length;

        // // for(int i=0; i<=n-1; i++) {
        // //     System.out.println(".(Provide input for elements of trr[" + i +"]: )");
        // //     trr[i]  = input.nextInt();

        // // }
        
        // // for(int val: trr) {
        // //     System.out.println(val + "*");
        // // }

        // int ten[] = {10,20,30,40,50};
        // int next = ten.length;
        //  int sum = 0;
        // for(int i=0; i<=next-1; i++) {
        //     System.out.println(ten[i]);
        //    sum = sum +ten[i];
        // }
        // System.out.println(sum);

        // int pen[] = {10,2,3,20};
        // int l = pen.length;
        // int multi = 1;
        // for(int i=0; i<=l-1; i++) {
        //     multi = multi * pen[i];
        // }
        // System.out.println(multi);


        // int arr[] = {4,2,-5,21,15} ;
        // int l = arr.length;
        // int max = arr[0];
        // for(int i=0; i<=l-1; i++) {
        //     if(max < arr[i]) {
        //         max = arr[i];
        //     }
        // }

        
        max(3);
        min(3);


    }
}
