package OOPS4;

public class LearnAnonymousClasses {

    OuterClass obj = new OuterClass() {

        void sing() {

        }

        public void outerMethod() {

        }
    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };

    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args) {
        WalkAble walkAble = (int steps) -> {
            System.out.println("Walked "+steps+" steps");
            return steps;
        };
        walkAble.walks(5);

        WalkAble obj2 = (steps) -> 2*steps; // (lambda expression)

        System.out.println(obj2.walks(8));
    }
}

interface WalkAble {

    int walks(int steps);
}

class OuterClass {

    public void outerMethod() {

    }
}

@FunctionalInterface
interface SuperInterface {

    void interfaceMethod();

}
