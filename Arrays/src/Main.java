public class Main
{
    public static void main(String[] args)
    {
        //Array --> içlerinde değişken saklamamıza yarayan verilerdir...
        //int a = 5;
        int[] liste = new int[3];
        liste[0]=1;
        liste[1]=2;
        liste[2]=3;

        int[] rakamlar={1,2,3,4};

        for (int i=0; i<liste.length;i++)
        {
            //int value = liste[i];
            //System.out.println(liste[i]);
        }

        for(int value : liste)
        {
            System.out.println(value);
        }
        String kelime ="Sahibinden";
        System.out.println(kelime.contains("ah"));
    }
}
