package exceptionHandling;

import java.io.IOError;

public class MainClass {
    public static void main(String[] args) {


//        try {
//            int result = 5/0;
//
//            System.out.println(a[8]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Tried to access the out of bound element");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

        int a[] = new int[5];

        System.out.println("Hello guys");

        try {
            int result = 5 / 0;

            System.out.println(a[8]);

//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception");
//        } catch (RuntimeException e) {
//
//        }

        } catch (Exception e) {
            System.out.println("all exception handle");
        }

        System.out.println("Bye guys");
    }
}
