import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.print("Enter number for table :");
        Scanner   t = new Scanner(System.in);
        int table = t.nextInt();
        t.close();
        for(int i=1; i<=10; i++) {
            System.out.println(table +" * " + i +" = " + (i*table));
        }
        System.out.println();
    }
}
