package exceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("My error is this");
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

