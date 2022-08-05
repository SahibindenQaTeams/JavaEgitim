import java.util.Scanner;

public class Main
{
    // psvm yazarak tab tuşuna bastığınızda aşağıdaki otomatik olarak yazılır..
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Lütfen a degeri girin(int) :");
        int a = input.nextInt();
        System.out.println("a:"+a);
        System.out.println("----------");
        System.out.println("Lütfen b degeri girin(byte) :");
        byte b = input.nextByte();
        System.out.println("b:"+b);
        System.out.println("----------");
        System.out.println("Lütfen c degeri girin(double) :");
        double c = input.nextDouble();
        System.out.println("c:"+c);
        */
        System.out.println("Lütfen Adınızı Girin:");
        String isim = input.nextLine();
        System.out.println("Lütfen Yaşınızı Girin:");
        int yas = input.nextInt();
        System.out.println("Ad:"+ isim +" Yaş:"+ yas);

    }
}
