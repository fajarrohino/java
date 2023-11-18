package konversi.com;

public class Main {
    public static void main(String[] args){
        //program untuk konversi data numerik

        int dataInt = 450; //32-bit
        System.out.println("data int = " + dataInt);

        //memperluas rentang ke tipe data yang lebih luas
        long dataLong = dataInt;
        System.out.println("data long = " + dataLong);

        //memperkecil rentang ke tipe data yang lebih kecil
        byte dataByte = (byte) dataInt;
        System.out.println("data byte = " + dataByte); // nilainya akan ngaco karena dataInt melebihi batas max byte

        //casting operator adalah mengkonversi data dengan menambahkan tipe data yang akan dikonversi
        // ex: byte dataByte = (byte) dataInt;
        // (byte) dataInt adalah casting operator

        //note
        //mengkonversi tipe data yang melebih data yang di targetkan nanti
        //datanya akan tidak sama dengan nilai sebelumnya atau datanya ddi kacau engga jelas

        //casting pembagian
        int a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%d / %d = %f \n", a,b,c); // hasilnya 2.000 jadi tidak sesuai
        //cara agar bisa sesuai apa yang diinginkan
        // 1. merubah salah satu variable
        float d = 10;
        int e = 4;

        float f = d/e;
        System.out.printf("%f / %d = %f \n", d,e,f);

        // 2. dengan cara casting
        float x = (float)a/b;
        System.out.printf("%d / %d = %f", a,b,x);
    }
}
