import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // kullanıcıdan alınan fiyat'a %8 kdv eklensin

        Scanner input = new Scanner(System.in);

        //urun
        System.out.println("Lütfen kdvsi hesaplanacak ürünün fiyatını giriniz:");
        double urunFiyati = input.nextDouble();

        //hesaplama kısmı
        double kdvDahilFiyati = urunFiyati + (urunFiyati* 0.08);

        //cıktı kısmı
        System.out.println("Ürünün kdv dahil fiyatı: "+ kdvDahilFiyati);


    }
}
