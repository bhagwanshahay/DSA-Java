public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {42, 73, 18, 91, 5, 67, 88, 34, 29, 76};
        int max = arr[0];
        for(int i =1; i< arr.length; i++ ) {
            if(max < arr[i]) {
                max =  arr[i];
            }
        }
        System.out.println(max);
    }
}