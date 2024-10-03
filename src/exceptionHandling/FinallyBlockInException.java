package exceptionHandling;

import java.security.spec.ECField;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int a[] = new int[5];

//        System.out.println("Hii Bob");
//
//        try {
//            System.out.println(a[6]);
//        } catch (Exception e) {
//           System.out.println("Exception Handled");
//        } catch (Exception e) {
//           System.out.println("Exception Handled");
//        } finally {
//            System.out.println("I will run always");
//        }
//
//        System.out.println("Bye Bob");

        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("catched the exp "+e.getMessage());
        }
    }

    static int getNumberFromArray(int a[]) throws ArithmeticException {
        return a[8];
    }
}
