public class IsBunker {

    public static void main (String [] args){

        System.out.println(isBunker(7));

    }

    public static int isBunker (int x){

        int k = 1;
        int i = 1;

        while (k <= x){

            k = k + (i - 1);
            if(k == x) return 1;

            i += 1;
        }

        return 0;

    }
}