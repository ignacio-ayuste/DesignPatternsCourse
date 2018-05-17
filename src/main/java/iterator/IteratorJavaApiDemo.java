package iterator;

import java.util.*;

public class IteratorJavaApiDemo {

    public static void main(String[] args) {

        //List<String> names = new ArrayList<String>();
        Set<String> names = new HashSet<String>();

        names.add("Pepe");
        names.add("Juan");
        names.add("Tomas");

        System.out.println("-- PRINT ELEMENT WITH FOR --");
        /*for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }*/

        System.out.println("-- PRINT ELEMENT WITH FOR EACH--");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("-- PRINT ELEMENT WITH ITERATOR PATTERN --");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }


}