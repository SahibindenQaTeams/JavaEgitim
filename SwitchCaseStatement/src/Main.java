import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // switch case -->  sade ve temiz kod imkanı sağlıyor

        Scanner input = new Scanner(System.in);
      /*
        System.out.println("Lütfen sayı giriniz:");
        int sayi = input.nextInt();

        switch (sayi)
        {
            case 1:
                System.out.println("Girilen sayı 1'e eşittir");
                break;
            case 2:
                System.out.println("Girilen sayı 2'ye eşittir");
                break;
            case 3:
                System.out.println("Girilen sayı 3'ye eşittir");
                break;
            case 4:
                System.out.println("Girilen sayı 4'ye eşittir");
                break;
            default:
                System.out.println("Girilen sayı 1,2,3,4'ten farklı");
                        break;
        }

        System.out.println("Lütfen sayı giriniz:");
        int sayi = input.nextInt();

        */
        System.out.println("Lütfen bulunduğunuz günü girin");
        String gun= input.nextLine(); // salı, SAlı //saLI
        switch (gun)
        {
            case "PAZAR":
                System.out.println("Haftanın 7.günü");
                break;
            case "PAZARTESİ":
                System.out.println("Haftanın ilk günü");
                break;
            case "SALI":
                System.out.println("Haftanın ikinci günü");
                break;
            case "ÇARŞAMBA":
                System.out.println("Haftanın ücüncü günü");
                break;
            default:
                System.out.println("Diğer günler");
                break;
        }
    }
}
