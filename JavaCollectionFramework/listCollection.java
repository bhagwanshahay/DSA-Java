package JavaCollectionFramework;
import java.util.*;


public class listCollection {
     static void main(String[] args) {
        
        ArrayList<Integer> array =  new ArrayList<>();
        ArrayList<Integer> a2 =  new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();


        // list<Integer> list3 = new ArrayList();

        
        
        
        
        // array.add(10);
        // array.add(20);
        // array.add(30);
        // array.add(40);
        // array.add(50);
        // array.add(60);
        // array.add(70);
        // array.add(80);


        // a2.add(100);
        // a2.add(50);
        // a2.add(60);
        // a2.add(70);
        // a2.add(90);
        // System.out.println(a2);
        
        // array.addAll(a2);
        // System.out.println(array);


        // array.set(0,15);
        // System.out.println(array);
        // array.removeAll(a2);
        // System.out.println(array);
        // array.clear();
        // System.out.println(array);

        
        a2.add(10);
        a2.add(15);
        a2.add(20);
        a2.add(45);
        System.out.println(a2);
        System.out.println(a2.size());

            Iterator<Integer> iterator = a2.iterator();
            while (iterator.hasNext()) {
                System.out.println( "element : " + iterator.next());

                System.out.println("*");
            }
    }
}
