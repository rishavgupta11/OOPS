package exceptionHandling;

import java.io.FileReader;
import java.util.ArrayList;

public class LearnExceptionHandling {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        //System.out.println(4/0);
        System.out.println(5);
        System.out.println(6);

        int arr[] = {1,2};

        try {
            System.out.println(arr[3]);
        }catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

//        finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of phe code...");
//    }

//        int arr[] = {1,2};
//        System.out.println(arr[3]);

        ArrayList<Integer> al = new ArrayList<>();

//        Error
//        java.lang.OutOfMemoryError
//        while (true) {
//            al.add(1);
//        }

    }
}
