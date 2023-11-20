package logic.com;

public class Main {
    public static void main(String[] args){
        //operator logika .. operator yang bisa dilakukan pd tipe data boolean
        // AND, OR , XOR, negasi (flipping)

        boolean x,y,z;
        // OR
        System.out.println("====== OR ( || )");
        x = true;
        y = true;
        z = ( x || y );
        System.out.printf("%s || %s = %s \n", x,y,z);
        x = true;
        y = false;
        z = ( x || y );
        System.out.printf("%s || %s = %s \n", x,y,z);
        x = false;
        y = true;
        z = ( x || y );
        System.out.printf("%s || %s = %s \n", x,y,z);
        x = false;
        y = false;
        z = ( x || y );
        System.out.printf("%s || %s = %s \n", x,y,z);

        //AND
        System.out.println("====== AND ( && )");
        x = true;
        y = true;
        z = ( x && y );
        System.out.printf("%s && %s = %s \n", x,y,z);
        x = true;
        y = false;
        z = ( x && y );
        System.out.printf("%s && %s = %s \n", x,y,z);
        x = false;
        y = true;
        z = ( x && y );
        System.out.printf("%s && %s = %s \n", x,y,z);
        x = false;
        y = false;
        z = ( x && y );
        System.out.printf("%s && %s = %s \n", x,y,z);

        //XOR exlusive or ( ^ )
        System.out.println("====== XOR ( ^ )");
        x = true;
        y = true;
        z = ( x ^ y );
        System.out.printf("%s ^ %s = %s \n", x,y,z);
        x = true;
        y = false;
        z = ( x ^ y );
        System.out.printf("%s ^ %s = %s \n", x,y,z);
        x = false;
        y = true;
        z = ( x ^ y );
        System.out.printf("%s ^ %s = %s \n", x,y,z);
        x = false;
        y = false;
        z = ( x ^ y );
        System.out.printf("%s ^ %s = %s \n", x,y,z);

        // not (!) negasi (flipping)
        System.out.println("====== NEGASI ( ! )");
        x = true;
        y = !x;
        System.out.printf("%s --> (!) %s \n", x,y);
        x = false;
        y = !x;
        System.out.printf("%s --> (!) %s \n", x,y);

    }
}
