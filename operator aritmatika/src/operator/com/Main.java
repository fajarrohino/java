package operator.com;

public class Main {
    public static void main(String[] args){
        //Operator Artimatika

        int var1 = 10;
        int var2 = 2;

        int var5 = 17;
        int var6 = 6;
        int addition;
        int subtraction;
        int multiplication;
        int pembagian;
        int modulus;

        //penjumlahan
        addition = var1 + var2;
        System.out.println(var1 + "+" + var2 + "=" + addition);
        //pengurangan
        subtraction = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1,var2,subtraction);
        //perkalian
        multiplication = var1 * var2;
        System.out.printf("%d * %d = %d \n", var1,var2,multiplication);
        //pembagian
        pembagian = var1 / var2;
        System.out.printf("%d / %d = %d \n", var1,var2,pembagian);

        double var3 = 13;
        double var4 = 2;
        double pembagian2 = var3 / var4;
        System.out.println(var3 + " / " + var4 + " = " + pembagian2);
        //modulus
        modulus = var5 % var6;
        System.out.println(var5 + " % " + var2 + " = " + modulus);
    }
}
