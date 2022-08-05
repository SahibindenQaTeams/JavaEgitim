import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //if else -- statement

        Scanner input = new Scanner(System.in);
        // yas aralıgımız 18 üstü 35 altı
        System.out.println("Lütfen Askerlik celbi kontrolü için yaşınızı girin:");
        int yas = input.nextInt();
        if((yas<18  || yas>35))
        {
            System.out.println("Askerlik için yaşınız uygun değil");
        }
        else
        {
            System.out.println("Askeriye'ye hoşgeldiniz");
        }
    }
}
