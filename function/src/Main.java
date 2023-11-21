public class Main {
    public static void main(String[] args){
        int x, y;
        y = 10;
        x = hitung(y);
        System.out.printf("x = %d \n", x);

        y = 30;
        x = hitung(y);
        System.out.printf("x = %d \n", x);

    }
    private static int hitung(int input){
        int hasil;
        hasil = (input - 5 ) * input;
        return hasil;
        // disini bisa public atau private
    }
}