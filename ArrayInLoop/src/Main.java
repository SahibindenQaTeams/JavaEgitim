import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        // kullanıcı x bir değer girsin, sistemde o değere kadar olan TEK sayıları bir arraye atıp saklasın.. //
        Scanner input = new Scanner(System.in);

        //10 ->> 0 0 0 0 0 0 0 0 0 0
        System.out.println("Kaç'a kadar ki tek sayıları diziye atmak ister siniz?");
        int a = input.nextInt();
        int[] liste = new int[a/2];

        int sayac=0;
        for (int i=1;i<=a;i++)
        {
            if (i%2!=0)
            {
                liste[sayac]=i;
                System.out.println(i);
                sayac++;
            }
        }

    }
}
