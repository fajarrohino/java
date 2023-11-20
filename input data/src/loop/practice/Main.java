package loop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, total;

        System.out.print("Start = ");
        a = input.nextInt();
        System.out.print("End = ");
        b = input.nextInt();

        total = 0;
        while(a<=b){
            total = total + a;
            System.out.println("ditambah " + a + " menjadi " + total);
            a++;
        }
    }
}
