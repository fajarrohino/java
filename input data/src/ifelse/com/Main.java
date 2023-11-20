package ifelse.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int data;

        System.out.print("input data = ");
        data = input.nextInt();

        if (data <= 20) {
            System.out.println("niali kurang dari 20");
            if (data < 10) {
                System.out.println("kurang dari 10");
            } else {
                System.out.println("lebih besar dari 10");
            }
        } else if (data == 21) {
            System.out.println("nilai sama dengan 21");
        } else {
            System.out.println("nilai terlallu besar");
        }
    }
}
