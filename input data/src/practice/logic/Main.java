package practice.logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input_data = new Scanner(System.in);
        System.out.println("Tebak-tebakan tgl lahir saya!");

        int lahir = 14;
        int inputTebak;
        boolean tebakan;

        System.out.print("Tebak tgl lahir = ");
        inputTebak = input_data.nextInt();
        System.out.println("Anda Menebak tgl = " + inputTebak);

        tebakan = lahir == inputTebak;
        System.out.println("Tebakan anda " + tebakan);

        System.out.println("diantara tgl 11 samapi 18");
        System.out.print("Tebak tgl lahir = ");
        inputTebak = input_data.nextInt();

        System.out.println("Anda Menebak tgl = " + inputTebak);
        tebakan = (inputTebak > 11) && (inputTebak < 18);
        System.out.println("Tebakan anda " + tebakan);
    }
}
