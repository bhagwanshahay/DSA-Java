package Strings;
public class StringsBasics {
    public static void main(String[] args) {
        String firstName = "Pradhan";
        String lastName = new String("Gurjar");
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length());
        System.out.println(lastName.length());
        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));

       for(int i=0; i<= firstName.length()-1; i++) {
        System.out.print("This are the elements of string firstName : ");
        System.out.print(firstName.charAt(i));
        System.out.println();
       }
       

       for(int i=0; i<= lastName.length()-1; i++) {
        System.out.print("This are the elements of string LastName : ");
        System.out.print(lastName.charAt(i));
        System.out.println();
        System.out.println("end");
       }


    }
}
