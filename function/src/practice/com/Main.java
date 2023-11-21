package practice.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, amount;

        System.out.print("Input n = ");
        n = input.nextInt();
        amount = fibonacci(n, "top");
        System.out.println("amount = "  + amount);
    }
    private static int fibonacci(int n, String root){
        System.out.println("root " + root);
        System.out.println("fibonacci to - " + n);
        if ( n > 20){
            System.out.println("The n value muste be below 20");
            return -1;
        } else if ( n == 1 || n == 0){
            return n;
        } else {
        return fibonacci(n-1, "left") + fibonacci(n-2, "right");
        }
    }
}
