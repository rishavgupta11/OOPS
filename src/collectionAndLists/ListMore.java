package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("mango");
        fruits.add("litchi");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruit is "+ fruits.get(i));
        }

        for (String fruit: fruits) {
            System.out.println("for each fruit "+fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while(fe.hasNext()) {
            System.out.println("iterator "+fe.next());
        }

        List<String> smallList = fruits.subList(1, 3);
        System.out.println(smallList);
    }
}
