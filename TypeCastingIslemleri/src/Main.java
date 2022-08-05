public class Main
{
    public static void main(String[] args)
    {
        // type casting : bir veri tipini diğer bir tipe dönüştürme işine yarar..
           // -> implicit casting :  daha dahar bir kapsamdan daha genişe dönüştürme işlemi;

        double sayi = 20;   // ( integer olan 20 -> double dönüştürülür )
        double sayi2 = 2.4f;

        long sayi3= 1000;    // int -> long

        ///////////////////////

            // --> explicit casting : daha geniş kapsamdan daha dar bir kapsama doğru yolculuk;

        int sayi4 = (int) 4.7;  // data kaybını ben burada gözalıyorum
        int sayi5 = (int)128L;
        float sayi6 = (float)1.2;
        System.out.println(sayi4);

    }
}
