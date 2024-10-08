package collectionQueueAndSet;

import java.util.*;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}


public class LearnSets {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Anuj");
        Student s2 = new Student(1, "Rishu");

        System.out.println(s1.equals(s2));

        set.add(new Student(1, "Rishu"));
        set.add(new Student(1, "Rohit"));
        set.add(new Student(1, "Ram"));

        System.out.println(set);


//        Set<String> set = new HashSet<>();

//        set.add("Rishu");
//        set.add("Pinku");
//        set.add("Rishu");
//        set.add("Pihu");
//
//        System.out.println(set);

//        Set<Integer> set = new HashSet<>(); //O(1)
//        Set<Integer> set = new LinkedHashSet<>(); //O(n)
//        Set<Integer> set = new TreeSet<>(); //O(logn)
//
//        set.add(10);
//        set.add(20);
//        set.add(50);
//        set.add(90);
//        set.add(90);
//        set.add(30);

//        set.remove(20);
//        System.out.println(set.contains(10));

//        System.out.println(set);
    }
}
