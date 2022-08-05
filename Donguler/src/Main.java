public class Main
{
    public static void main(String[] args)
    {
        /*
        for,while, do while, foreach;

        for(baslatma;kosul;arttırma veya azaltma islemleri)
        {
        koşul sağlandığı sürece çalışmasını istediğimiz kodlar buraya yazılır
        }

        while(dongu kosulu)
       {
       kosul saglandıgı surece calismasini istediğimiz kodlar buraya yazılır
       -->sayac manuel arttırılmalı
       }

       do{
       kosul saglandıgı surece calismasini istediğimiz kodlar buraya yazılır
       diğerlerinden farklı olarak en az bir kere çalışır...
       }while(kosul)
       */

         for(int x =0;x<=50;x++)
        {
        //System.out.println("Sayı:"+ x);
        }

         int y = 10;
         while(y<20)
         {
             //System.out.println(y+" değeri 20 den küçük");
             y=y+1;
         }

        int z = 1;
         do{

            //System.out.println("Girilen sayı 20 den küçük");
            z=z+1;
            }while(z<20);

         for(int a = 0; a<3;a++)
         {
             for(int b=0;b<3;b++)
             {
                 System.out.println("["+a+"-"+b+"]");
             }
             System.out.println("");
         }



    }
}
