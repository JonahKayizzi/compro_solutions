public class IsPascal {

    public static void main (String[]args){

        System.out.println(isPascal(4));

    }

    public static int isPascal (int n){
        int x = 0;
        int pascal = 0;
        
        while (x < n){

            pascal = pascal + x;

            if(n == pascal) return 1;

            x += 1;

        }

        return 0;

    }
}