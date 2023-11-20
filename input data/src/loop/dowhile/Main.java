package loop.dowhile;

public class Main {
    public static void main(String[] args){
        // do while
        // akan menjalankan do terlebih dahulu baru kemudian while kemudian do lagi ke while lagi dan seterusnya

        int a = 0;
        boolean end = true;

        do {
            a++;
            System.out.println("do while -" + a);
            if (a == 20){
                end = false;
            }
        } while (end);
    }
}
