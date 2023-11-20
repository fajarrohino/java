package input.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        int p,l,luas;
        System.out.print("Panjang = ");
        p = input.nextInt();
        System.out.print("Lebar = ");
        l = input.nextInt();
        luas = p * l;
        System.out.println("Luas = " + luas);
    }
}
