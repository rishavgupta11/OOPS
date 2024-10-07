package CollectionFramework;

import java.util.*;

public class Collection {

    public static void main(String[] args) {

        //package
        //Interface
        //Class
        //Wrapper Class
        //Generics
        //Objects
        //Iterator
        //Collection
        //Arrays
        //Comparator

        //list
        //ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        System.out.println(list);

        //LinkedList
        List linkedList = new LinkedList<Integer>();
        linkedList.add(0, 20);
        linkedList.add(10);
        linkedList.add(1, 15);
        linkedList.remove(1);
        System.out.println(linkedList);

        //Vector
        Vector<String> vector = new Vector<String>();
        vector.add("5");
        vector.add("10");
        vector.add("15");
        System.out.println("Vector = "+vector);
        vector.clear();
        System.out.println(vector);

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(10);
        stack.push(20);
        System.out.println("Stack = "+stack);
        stack.pop();
        System.out.println(stack.peek());

        //Set = ?
        //HashSet
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(16);
        set.add(2);
        set.add(2);
        System.out.println("Set = "+set);

        //LinkedHashSet
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();
        llset.add(5);
        llset.add(2);
        llset.add(2);
        llset.add(10);
        System.out.println("LlSet = "+llset);
        llset.contains(2);
        boolean bl = llset.contains(2);
        System.out.println("2 is present or not = "+bl);

        //TreeSet
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(4);
        tset.add(9);
        tset.add(2);
        tset.add(3);
        tset.add(2);
        System.out.println("TSet = "+tset);


    }
}
