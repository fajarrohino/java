package functionvoid.com;

public class Main {
    public static void main(String[] args){
        System.out.println(example("float"));

        functionVoid("Sayang");
        functioMiss("nurul");

    }
    private static float example(String input){
        return 10.0f;
        // harus ada return karean function ini bukan void
    }
    private static void functionVoid(String input){
        System.out.println("selamat pagi " + input);
    }
    public static void functioMiss(String input){
        System.out.println("I miss u " + input);
        // meskipun public tidak akan muncul console. akan muncul ketika dipanggil di function main
        // void = hampa = kosong. tidak akan mengembalikan return hanya menjalankan code saja
    }
}
