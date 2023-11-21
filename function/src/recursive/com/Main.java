package recursive.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, amountOfValue, factorialOfValue;
        System.out.print("input x = ");
        x = input.nextInt();
        printValue(x);
        amountOfValue = amount(x);
        System.out.println("amount = "+amountOfValue);
        factorialOfValue = factorial(x);
        System.out.println("factorial = " + factorialOfValue);

    }
    private static int factorial(int parameter){
        System.out.println("parameter - "+ parameter);
        if (parameter==1){
            return parameter;
        }
        int result = parameter * factorial(parameter-1);
        return result;
    }
    private static int amount(int parameter){
        System.out.println("parameter - "+ parameter);
        if (parameter==0){
            return parameter;
        }
        int result = parameter + amount(parameter-1);
        return result;
    }
    private static void printValue(int parameter){
        System.out.println("value - " + parameter);
        if (parameter == 0){
            return;
        }
        parameter--;
        printValue(parameter);
        // ini akan berjalan berulang tanpa batas sampai StackOverFlow Error
        // untuk solve menggunakan pengkondisian. recursive most need condition
    }
}
