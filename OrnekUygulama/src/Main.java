import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        // kullanıcının girdiği 2 sayı arasında 3 ve 5 ortak bölünebilen sayıları bulalımm..

        Scanner sayi = new Scanner(System.in);

        System.out.println("Lütfen a değerini giriniz:");
        int a = sayi.nextInt();
        System.out.println("Lütfen b değerini giriniz");
        int b = sayi.nextInt();

        for (int i = a; i<=b; i++)
        {
            if (i%3 == 0 && i%5== 0)
            {
                System.out.println("Bu sayı hem 3 hem de 5 'e tam bölünür:"+i);
            }
        }
    }
}
