package ternary.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // ternary == if else... lebih singkat
        Scanner input = new Scanner(System.in);

        int x, data;

        System.out.print("input x = ");
        x = input.nextInt();

        data = (x == 10) ? x * x + x : x + x ;
        System.out.println("data = " + data);
    }
}
