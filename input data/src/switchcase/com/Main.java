package switchcase.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // switch case ... bisa untuk satuan (int, long, shot, byte), string atau enum
        Scanner inputData = new Scanner(System.in);

        String user;

        System.out.print("Absen nama = ");
        user = inputData.next();

        switch (user){
            case "fajar":
                System.out.println(user + " hadir bosku!");
                break; //untuk stop jika true
            case "rohino":
                System.out.println(user + " hadir bosku!");
                break;
            default:
                System.out.println(user + " tidak hadir!");
        }
    }
}
