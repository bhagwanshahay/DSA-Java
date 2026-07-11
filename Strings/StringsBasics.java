package Strings;
public class StringsBasics {
        static void printString(String str){
            int n = str.length();

            for(int i=0; i<=n-1; i++) {
                char ch = str.charAt(i);
                System.out.println(ch);
            }
        }
        static int getLengthOfString(String str) {
            char[] arr = str.toCharArray();
            int len = arr.length;
            return len;
        }

        static int getVowelsCount(String str) {
            int count = 0;
            for(int i=0; i<=str.length()-1;  i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count ++;
                }
            }
            return count;
        }

        static String reverseString(String str) {
            String reverse = "";
            int n = str.length();
            for(int i=n-1; i>=0; i--){
                char ch = str.charAt(i);
                reverse = reverse + ch;
            } 
            return reverse;

        }
        
        static void reversepal(String str) {
            String reverse ="";
            int n = str.length()-1;
            String orignal = str;

            for(int i=n; i>=0; i--){
                char ch = str.charAt(i);
                reverse += ch;
            }

            if(orignal == reverse) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
        static boolean check(String str) {
            String original = str;
            String reverse = reverseString(original);

            for(int i=0; i<=original.length()-1; i++){
                char ch = original.charAt(i);
                char ch1 = original.charAt(i);

                if(ch1 != ch) {
                    return false;
                }
            }
            return true;
        }
    static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<= nums.length-1; i++){
            
            ans[i] = nums[nums[i]];
            

        }
        return ans;
    }

    static int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[n] = nums[i];
            n++;

        }
        return ans;
    }

    public static void main(String[] args) {
        
        // System.out.println(check("poop"));
        // System.out.println("this is the end ");

        // int nums[] = {1,2,1};
        //     System.out.println(buildArray(nums));
        //     System.out.println(getConcatenation(nums));

        


        











        // System.out.print("In this String vowels are : ");
        // System.out.println(getVowelsCount( "Pradhan"));

        // System.out.println(reverseString("12345"));

        // printString("pradhan");
        // System.out.println();
        // System.out.println(getLengthOfString("set"));
        
        // String Pradhan = new String("Pradhan");
        // System.out.println(Pradhan.toUpperCase());
        

       
    //     String firstName = "Pradhan";
    //     String lastName = new String("Gurjar");
    //     System.out.println(firstName + " " + lastName);
    //     System.out.println(firstName.length());
    //     System.out.println(lastName.length());
    //     System.out.println(firstName.charAt(0));
    //     System.out.println(lastName.charAt(0));

    //    for(int i=0; i<= firstName.length()-1; i++) {
    //     System.out.print("This are the elements of string firstName : ");
    //     System.out.print(firstName.charAt(i));
    //     System.out.println();
    //    }
       

    //    for(int i=0; i<= lastName.length()-1; i++) {
    //     System.out.print("This are the elements of string LastName : ");
    //     System.out.print(lastName.charAt(i));
    //     System.out.println();
    //    }


    //    String Name = "Pradhan";
    //    String Name1 = "PRADHAN";

    //    if(Name == Name1) {
    //     System.out.println("Yes");
    //    }else {
    //     System.out.println("No");
    //    }
    //    System.out.println(Name.equals(Name1));
       
    //    if(Name.equals(Name1)) {
    //     System.out.println("Yes");
    //    }else {
    //     System.out.println("No");
    //    }

    //    if(Name.equalsIgnoreCase(Name1)) {
    //     System.out.println("Yes");
    //    }else {
    //     System.out.println("No");
    //    }

    // Scanner input = new Scanner(System.in);
    // System.out.print("Kuch input de de re baba : ");
    // String kuch_de_de_re_baba = input.nextLine();
    // System.out.println(kuch_de_de_re_baba);


    //String dot oprations or oprator 
    // String name = "Pradhan";
    // String name2 = "PRADHAN";
    // System.out.println(name.length());
    // System.out.println(name.charAt(0));
    // System.out.println(name.toUpperCase());
    // System.out.println(name.toLowerCase());
    // System.out.println(name.chars());
    // System.out.println(name.compareTo(name2));
    // System.out.println(name.equals(name2));
    // System.out.println(name.equalsIgnoreCase(name2));
    // System.out.println(name.contentEquals(name2));

    // String name = "               pradhan  GURAJR        ";
    // String name2 = "PRADHAN";
    // // System.out.println(name.isBlank());
    // // System.out.println(name.isEmpty());
    // // System.out.println(name.trim());
    // // System.out.println(name.length());
    // String big = "My name is bhagwan Shahay " ;
    // System.out.println(big.substring(3,6));

    // System.out.println(big.contains("bhagwan"));
    
    
    // int num = 5123;
    // String str = String.valueOf(num);
    // System.out.println(num);
    // System.out.println(str);

    // String suff = "Pradhan Gurjar is also knows as Bhagwan Shahay in the Proffesional world";
    // System.out.println(suff.startsWith("Pradhan "));
    // System.out.println(suff.endsWith("world"));

        // String arr = "array";
        // char[] ch = arr.toCharArray();
        // System.out.println(ch);

        // for(char and: ch) {
        //     System.out.println("Value of char : " + and); 
        // }

        // String name = "my , name , is , pradhan , gurjar ";
        // System.out.println(name.split(","));
        // String[] words = name.split(",");
        // System.out.println(words);

        // for(String str: words) {
        //     System.out.println(str);
        // }

    //     String name = "pradhan";
    //   name =   name.replace('p','b');
    //     System.out.println(name);
        
    }
}
