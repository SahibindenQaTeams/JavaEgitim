public class Main
{
    public static void main(String[] args)
    {
        /*
        //aritmetik operatorler;
        int a = 10;
        int b= 5;
        int c;
        int d;
        int e;
        int f;
        //toplama
        c= a+b;
        // cikartma
        d= a-b;
        //carpma
        e= a*b;
        //bolme
        f=a/b;
        //mod alma
        int g = a%b;

        System.out.println("toplama:"+c);
        System.out.println("cikartma:"+d);
        System.out.println("carpma:"+e);
        System.out.println("bolme:"+f);
        System.out.println("mod alma:"+g);

        //iliskisel operatorler...
        boolean esitMi = (a==b);
        System.out.println("a ve b eşit mi:"+ esitMi);
            boolean buyukMu = (a>b);
        System.out.println("a b 'den büyük mü : "+ buyukMu);
        boolean kucukMu = (a<b);
        System.out.println("a b 'den küçük mü : "+ kucukMu);
        boolean buyukEsitMi =(a>=b);
        System.out.println("a büyük esittir b mi:"+ buyukEsitMi);
        boolean kucukEsitMi = (a<=b);
        System.out.println("a küçük eşittir b mi:"+ kucukEsitMi);
        */
        //mantıksal operatorler --> ve (a&&b) veya (a||b)  değil !(a&&b)
        int sayi1=100;
        int sayi2=50;

        boolean deger = (sayi1==100 && sayi2==50);
        System.out.println(deger);

        int sayi3= 75;
        int sayi4=60;
        boolean deger2= (sayi3<80 || sayi4 <50);
        System.out.println(deger2);

        int sayi5= 100;
        int sayi6=200;
        boolean deger3= !(sayi5<90 == sayi6<190);
        System.out.println(deger3);


        //kosul operatorlerimiz;
        int sayi7 = 7;
        String sonuc= (sayi7==7)? "Sayı 7 ye eşit":"Sayı 2 ye eşit değil" ;
        System.out.println(sonuc);

    }
}
