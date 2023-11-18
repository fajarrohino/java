package unary.com;

public class Main {
    public static void main(String[] args){
        //unary => mengubah hanya pada satu variable

        //unary + and -
        int a = 10;
        System.out.printf("unary '-' %d \n", -a);
        System.out.printf("unary '+' %d \n", +a); //tidak terjadi perubahan

        //unary decrement and increment
        int number = 10;
        ++number; //increment
        System.out.printf("increment %d \n", number);
        int angka = 20;
        --angka;
        System.out.printf("decrement %d", angka);
    }
}
