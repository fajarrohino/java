package calculator.ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float a, b, c;
        char operator;

        System.out.print("nilai a = ");
        a = input.nextFloat();
        System.out.print("operator = ");
        operator = input.next().charAt(0);
        System.out.print("nilai b = ");
        b = input.nextFloat();

        System.out.println("input user = " + a + " " + operator + " " + b);

        if (operator == '+'){
            c = a + b;
            System.out.println("hasil = " + c );
        } else if (operator == '-') {
            c = a - b;
            System.out.println("hasil = " + c );
        } else if (operator == '*') {
            c = a * b;
            System.out.println("hasil = " + c );
        } else if (operator == '/') {
            c = a / b;
            System.out.println("hasil = " + c );
        } else {
            System.out.println("operator tidak ditemukan!");
        }
    }
}
