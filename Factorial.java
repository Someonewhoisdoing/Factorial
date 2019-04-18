package a;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int i = scanner.nextInt();
        for (int j = 1; j <= i; j++) {

            factorial = factorial * j;
        }
        System.out.println("Factorial of " + i + " is " + factorial);
    }
}

