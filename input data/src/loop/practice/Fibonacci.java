package loop.practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int fn, fn_1, fn_2,n;
        System.out.print("Masukan nilai = ");
        n = input.nextInt();

        fn_1 = 1;
        fn_2 = 0;
        fn = 1;

        for (int i = 1; i <= n; i++){
            System.out.println("nilai ke -" + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
