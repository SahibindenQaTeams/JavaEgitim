public class Main
{
    public static void main(String[] args)
    {
        String kelime = "SAhibinden.com";
        String kelime2= " Hoşgeldiniz";

        System.out.println(kelime.length());
        System.out.println(kelime.concat(kelime2));
        System.out.println(kelime.indexOf('b'));
        System.out.println(kelime.charAt(7));
        System.out.println(kelime.compareTo("inden"));
        System.out.println(kelime.replace(".com",".net"));
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.toLowerCase());

        char[] str = {'B','A','Ş','A','R','I'};
        String kelime3= new String(str);
        System.out.println(kelime3);
    }
}
