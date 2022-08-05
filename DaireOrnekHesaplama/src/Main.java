import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Daire Alan Hacim Hesaplama
        int r;
        double alan,hacim;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz :");
        r = input.nextInt();

        alan = 2 * pi*r;
        hacim = pi * (r*r);

        System.out.println("Dairenizin alanı : "+ alan);
        System.out.println("Dairenin hacmi :"+ hacim);

    }
}
