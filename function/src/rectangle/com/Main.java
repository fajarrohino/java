package rectangle.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Persegi");

        int p,l;

        System.out.print("panjang = ");
        p = input.nextInt();
        System.out.print("lebar = ");
        l = input.nextInt();

        System.out.println("\nCalling in the main");
        image(p,l);
        System.out.println("Luas persegi = "+extensive(p, l));
        System.out.println("Keliling persegi = "+circumference(p, l));

        System.out.println("\ncalling in the combination");
        combination(p,l);

    }
    private static void combination(int panjang, int lebar){
        image(panjang,lebar);
        System.out.println("Luas = " + extensive(panjang, lebar));
        System.out.println("Keliling = " + circumference(panjang, lebar));
    }
    private static int extensive(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    private static void image(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    private static int circumference(int panjang, int lebar){
        int result = panjang + lebar + panjang + lebar;
        return result;
    }
}
