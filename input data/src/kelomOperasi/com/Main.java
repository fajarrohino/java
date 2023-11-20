package kelomOperasi.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // perkalian dan pembagian yang akan dijalankan terlebih dahulu
        // kemudian penjumlahan dan pengurangan
        // ex 2 * 3 + 3 = 9
        // ex (2 * 3) + 3 = 9
        // ex 3 + 2 * 3 = 9
        Scanner input_data = new Scanner(System.in);
        int x, y, z, hasil;
        System.out.println("Perkelompokan Operasi Artimatika!");
        System.out.print("X = ");
        x = input_data.nextInt();
        System.out.print("y = ");
        y = input_data.nextInt();
        System.out.print("z = ");
        z = input_data.nextInt();

        hasil = (x * x) + z + y;
        System.out.println(hasil);

        hasil =  z + y / x + x * x;
        System.out.println(hasil);

    }
}
