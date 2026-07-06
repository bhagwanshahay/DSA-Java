
import java.util.Scanner;

public class MethodsAndFunction { 
    
    public class Functions {  
         public static void   print(int x ){ 
            System.out.println(x);
            return ; 
        }

        public static void printMyName(String name){
            System.out.println(name);
            return;
        }


    }
    public static void main(String[] args) {
        Functions obj;
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();
        String name = value.next();
        printMyName(name);

            
        
    }
}
