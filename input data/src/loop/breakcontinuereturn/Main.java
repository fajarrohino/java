package loop.breakcontinuereturn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //return akan kembali ke method ini bosku!
        Scanner input = new Scanner(System.in);

        int x = 0;
        while (true){
            x++;
            if (x == 10){
                break;
                // keyword untuk memaksa keluar dari loop
            } else if (x == 5) {
                continue;
                // keyword utk memaksa memulai loop dr awal
            } //else if (x == 9) {
//              return;
//                // keyword utk kembali ke method
//            }
            System.out.println("looping ke -" + x);
        }
        System.out.println("looping selesai!");
    }
}
