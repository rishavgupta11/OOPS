package OOPS4;

public class Learninterfaces {

//    Animal a1 = new Animal();

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.drinks();

        System.out.println(Animal.LEGS);
    }

}

interface Pet {
    void sings();

    void drinks();
}

interface Animal {

    int LEGS = 4;

    void eats();

    void drinks();
}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }
}
