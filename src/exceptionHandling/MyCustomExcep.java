package exceptionHandling;

public class MyCustomExcep extends Exception {
    MyCustomExcep(String msg) {
        super(msg);
    }
}

class beta {
    static void pass(int marks) throws MyCustomExcep {
        if (marks < 30) {
            throw new MyCustomExcep("beta fail hogya sala!!");
        }
    }
}
