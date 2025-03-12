//2. Write a java program that check if a given integer is a part of a Fibonacci sequence or not using recursion.
// Recursion means: Recursion in Java is a powerful programming technique that allows a function to call itself
//                  within the body of its own function.

import java.util.Scanner;

public class FibonacciSequence{

    // calculate n-th Fibonacci number recursively
    public static int fibonacciNumCheck(int n) {
        if (n <= 1) return n;
        return fibonacciNumCheck(n-1) + fibonacciNumCheck(n-2);
    }
    // check Fibonacci number
    public static boolean checkFibonacci(int number) {
        int fib = 0;
        int i = 0;
        while ((fib = fibonacciNumCheck(i)) < number) {
            i++;
        }
        return number == fib;
    }
    public static void main(String[] args) {

        System.out.println("Enter the number which you want to check weather it's a fibonacci number or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isFibonacciNumber = checkFibonacci(n);
        if (isFibonacciNumber) {
            System.out.println( n + " is a Fibonacci number.");
        } else {
            System.out.println( n + " is not a Fibonacci number.");
        }
    }
}