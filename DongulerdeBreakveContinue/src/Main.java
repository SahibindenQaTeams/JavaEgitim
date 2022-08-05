public class Main
{
    public static void main(String[] args)
    {
        // dongulerde break ve continue;
        /*
        break : Döngü herhangi bi yerde break ile karşılaşırsa içinde bulunduğ döngüyü durdurur ve döngü TAMAMEN sonlanır;
        continue : Döngü herhangi bi yerde continue ile karşılaştığında aşağısında yapılacak işleri yapmadan direk döngünün başına döner sonraki iş için hazır bekler
         */

        int i= 0;
        while(i<20)
        {
            if (i==10)
            {
                break;
            }
            //System.out.println("i ="+i);
            i++;
        }

        for (int a =0;a<10;a++)
        {
            if(a==3 || a==5)
            {
                continue;
            }
            System.out.println("a:"+a);
        }
    }
}
