package komparasi.com;

public class Main {
    public static void main(String[] args){
        //operator komparasi .. akan mengasikan nilai dalam bentuk boolean
        int x, y;
        x = 10;
        y = 10;
        boolean z;
        z = (x == y);
        System.out.println("===== PERSAMAAN ( == ) strictly equal");
        System.out.printf("%d == %d --> %s \n", x,y,z);

        x = 13;
        y = 23;
        z = (x == y);
        System.out.printf("%d == %d --> %s \n", x,y,z);


        System.out.println("===== PERTIDAKSAMAAN ( != ) not equal");

        x = 10;
        y = 10;
        z = (x != y);
        System.out.printf("%d != %d --> %s \n", x,y,z);
        x = 13;
        y = 23;
        z = (x != y);
        System.out.printf("%d != %d --> %s \n", x,y,z);

        System.out.println("===== LEBIH DARI ( > ) greater than");
        x = 10;
        y = 5;
        z = (x > y);
        System.out.printf("%d > %d --> %s \n", x,y,z);
        x = 13;
        y = 23;
        z = (x > y);
        System.out.printf("%d > %d --> %s \n", x,y,z);

        System.out.println("===== KURANG DARI ( < ) less than");
        x = 10;
        y = 5;
        z = (x < y);
        System.out.printf("%d < %d --> %s \n", x,y,z);
        x = 13;
        y = 23;
        z = (x < y);
        System.out.printf("%d < %d --> %s \n", x,y,z);

        System.out.println("===== LEBIH DARI SAMA DENGAN ( >= ) greater than equal");
        x = 10;
        y = 10;
        z = (x >= y);
        System.out.printf("%d >= %d --> %s \n", x,y,z);
        x = 23;
        y = 13;
        z = (x >= y);
        System.out.printf("%d >= %d --> %s \n", x,y,z);
        x = 13;
        y = 23;
        z = (x >= y);
        System.out.printf("%d >= %d --> %s \n", x,y,z);

        System.out.println("===== KURANG DARI SAMA DENGAN ( <= ) less than equal");
        x = 10;
        y = 10;
        z = (x <= y);
        System.out.printf("%d <= %d --> %s \n", x,y,z);
        x = 23;
        y = 13;
        z = (x <= y);
        System.out.printf("%d <= %d --> %s \n", x,y,z);
        x = 13;
        y = 23;
        z = (x <= y);
        System.out.printf("%d <= %d --> %s \n", x,y,z);

    }
}
