public class Main
{
    public static void main(String[] arg)
    {
        // tam sayılar için -> byte, short, int, long
        // byte alabileceği değer +127 ve -128
        // short alabileceği değer +32.767 ve -32786
        // int 2 milyar üzeri + -
        // long int'dan çok çoook daha büyük veri kapasitesine sahip..
/*
        int a = 12500;
        byte b = 100;
        short c =1000;

        int d= 136;
        int e= 32768;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        float f= 12.5f;
        double g= 3.14;
        */

        int a = 22/7;
        float b= 22f/7f;
        double c = 22d/7d;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);

        // char veri tipi : karakterleri göstermek için kullanırız .. 2 byte veri kaplar...
        char x ='a';
        // boolean veri tipi : koşul durumlarında kullanılır.. ve sadece true ve false değerini alır.
        boolean y =true;

        String isim ="Halil İbrahim...";

        System.out.println("ADI:"+isim);

    }
}
