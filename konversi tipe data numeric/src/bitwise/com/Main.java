package bitwise.com;

public class Main {
    public static void main(String[] args){
        //Operator bitwise ... operator untuk melalukan operasi pada nilai bit
        byte x,y,z;
        String xBits, yBits, zBits;

        //operator SHIFT LEFT ( << )
        System.out.println("===== SHIFT LEFT ( << ) =====");
        x = 3;
        xBits= String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s = %d \n", xBits, x);
        y = (byte) (x << 4); // niali x akan bergeser ke kiri 4
        yBits = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.printf("%s = %d \n", yBits, y);

        //operator SHIFT RIGHT ( >> )
        System.out.println("===== SHIFT LEFT ( >> ) =====");
        x = 24;
        xBits= String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s = %d \n", xBits, x);
        y = (byte) (x >> 3);
        yBits = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.printf("%s = %d \n", yBits, y);

        //operator BITWISE OR ( | )
        System.out.println("===== BITWISE OR ( | ) =====");
        x = 12;
        xBits= String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s = %d \n", xBits, x);
        y = 24;
        yBits= String.format("%8s", Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s = %d \n", yBits, y);
        z = (byte) (x | y);
        zBits = String.format("%8S", Integer.toBinaryString(z)).replace(' ','0');
        System.out.printf("%s = %d \n", zBits, z);

        //operator BITWISE AND ( & )
        System.out.println("===== BITWISE AND ( & ) =====");
        x = 12;
        xBits = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.printf("%s = %d \n", xBits, x);
        y = 24;
        yBits = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.printf("%s = %d \n", yBits, y);
        z = (byte) (x & y);
        zBits = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        System.out.printf("%s = %d \n", zBits, z);

        //operator BITWISE XOR ( ^ )
        System.out.println("===== BITWISE XOR ( ^ ) =====");
        x = 12;
        xBits = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.printf("%s = %d \n", xBits, x);
        y = 24;
        yBits = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
        System.out.printf("%s = %d \n", yBits, y);
        z = (byte) (x ^ y);
        zBits = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
        System.out.printf("%s = %d \n", zBits, z);

        //operator BITWISE NEGASI (  )
        System.out.println("===== BITWISE AND ( ~ ) =====");
        x = 36;
        y = (byte) (~x);
        xBits = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.printf("%s = %d \n", xBits, x);
        yBits = String.format("%8s", Integer.toBinaryString(y)).substring(24);
        System.out.printf("%s = %d \n", yBits, y);

    }
}
