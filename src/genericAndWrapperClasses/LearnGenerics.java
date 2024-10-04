package genericAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("asdn344", "Leo");
        Dog<String, Integer> D2 = new Dog<>("xex232", 809);

        Dog<Integer, String> d3 = new Dog<>(13, "Leo");

        System.out.println(d3.getId());

//        ArrayList<Integer> a = new ArrayList<>();

    }
}

class Dog<E, V> {

    E id;

    V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;

    }
}
