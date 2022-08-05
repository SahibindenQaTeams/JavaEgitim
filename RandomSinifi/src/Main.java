import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random randomSayi = new Random();

        int sayi1;

        sayi1 = randomSayi.nextInt();
        System.out.println(sayi1);

        double sayi2;

        sayi2= randomSayi.nextDouble();
        System.out.println(sayi2);
    }
}
