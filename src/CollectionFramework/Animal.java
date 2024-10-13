package CollectionFramework;

public class Animal {

    int age;
    int name;
    int weight;

    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = Integer.parseInt(name);
    }
}
