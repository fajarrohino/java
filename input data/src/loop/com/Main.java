package loop.com;

public class Main {
    public static void main(String[] args){
        // looping perulangan
        //while

        int a = 0;
        boolean end = true;

        while (end){
            System.out.println("looping ke -" + a);
            a++;
            if (a == 20){
                end = false;
            }
        }
    }
}
