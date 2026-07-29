package java_collection_and_framework;

import java.util.ArrayList;

public class listCollection {
    public static void main(String[] args) {
        
        ArrayList<Integer> array =  new ArrayList<>();
        ArrayList<Integer> a2 =  new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();
        
        
        
        
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);


        a2.add(100);
        a2.add(50);
        a2.add(60);
        a2.add(70);
        a2.add(90);
        System.out.println(a2);
        
        array.addAll(a2);
        System.out.println(array);


        array.set(0,15);
        System.out.println(array);
        array.removeAll(a2);
        System.out.println(array);
        array.clear();
        System.out.println(array);
        
        


    }
}
