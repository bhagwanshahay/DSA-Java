
import java.util.Scanner;

public class MethodsAndFunction { 
    
    public static class Functions {  
         public static void   print(int x ){ 
            System.out.println(x);
            return ; 
        }

        public static void printMyName(String name){
            System.out.println(name);
            
        }


    }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();
        String name = value.next();
        Functions.printMyName(name);

            
        
    }
}
